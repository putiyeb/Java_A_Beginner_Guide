interface IGenStack<T>{
    void push(T o);
    T pop() throws StackEmptyException;
}

class Gstack<T> implements IGenStack<T>{
    T[] st;
    int loc;
    Gstack(T[] st){
        this.st = st;
        loc = 0;
    }

    public void push(T o){
        if(loc == st.length){
            System.out.println("The Stack is full");
            return;
        }
        st[loc++] = o;
    }

    public T pop() throws StackEmptyException{
        if(loc == 0) throw new StackEmptyException();
        return st[--loc];
    }
}

class StackEmptyException extends Exception{
    public String toString(){
        return "The Stack is empty";
    }
}

class Test{
    public static void main(String args[]){
        Gstack<Integer> st1 = new Gstack<>(new Integer[5]);

        for(int i = 0; i < 10; i++){
            st1.push(i);
        }

        try{
            for(int i = 0; i < 10; i++){
                System.out.println(st1.pop());
            }
        }
        catch(StackEmptyException exc){
            System.out.println(exc);
        }

    }
}



/*
The Stack is full
The Stack is full
The Stack is full
The Stack is full
The Stack is full
4
3
2
1
0
The Stack is empty

*/
