package test;

class FixedQueue implements ICharQ{
    char a[];
    int start = 0,end = 0;
    public FixedQueue(int b){
        a = new char[b];
    }

    public char get(){
        if(start != end){
            return a[start++];
        }else{
            System.out.println("The Queue is empty!");
            return '0';
        }
    }

    public void put(char c){
        if(end < a.length){
            a[end++] = c;
        }else{
            System.out.println("The Queue is full!");
        }
    }
}

class CircularQueue implements ICharQ{
    char a[];
    int start = 0;
    int end = 0;
    public CircularQueue(int b){
        a = new char[b];
    }

    public char get(){

        if(start == end){
            System.out.println("Empty");
            return '0';
        }

        char ch = a[start++];
        if(start == a.length && start != end) start = 0;
        if(start == a.length && start == end) {
            start = 0;
            end = 0;
        }
        return ch;
    }

    public void put(char c){
        if((( start == 0 ) & ( end == a.length )) || end+1==start){
            System.out.println("Full");
            return;
        }
        if(end == a.length) end = 0;
        a[end++] = c;
    }
}

class IQDemo{
    public static void main(String args[]){
        CircularQueue q = new CircularQueue(3);
        char ch = 'a';
        for (int i = 0; i < 4; i++) {
            q.put(ch++);
        }

        for (int j = 0; j < 2; j++) {
            char t = q.get();
            if(t != '0'){
                System.out.println(t);
            }
        }

        for (int i = 0; i < 4; i++) {
            q.put(ch++);
        }

        for (int j = 0; j < 4; j++) {
            char t = q.get();
            if(t != '0'){
                System.out.println(t);
            }
        }
    }
}