class StackFull extends Exception{
    public String toString(){
        return "Full";
    }
}

class StackEmpty extends Exception{
    public String toString(){
        return "Empty";
    }
}

class FixStack{
    int[] st;
    int index;
    FixStack(int size){
        st = new int[size];
        index = 0;
    }

    void put(int a) throws StackFull{
        if(index == st.length){
            throw new StackFull();
        }
        st[index++] = a;
        return;
    }

    int get() throws StackEmpty{
        if(index == 0){
            throw new StackEmpty();
        }
        return st[--index];
    }
}

class Test{
    public static void main(String args[]){
        FixStack stack = new FixStack(5);
        for(int i = 0; i<7;i++){
            try{
            stack.put(i);
            System.out.println(i);
            }
            catch(StackFull exc){
                System.out.println(exc);
            }
        }

        for(int j = 0; j<7;j++){
            try{
            System.out.println(stack.get());
            }
            catch(StackEmpty exc){
                System.out.println(exc);
            }
        }
    }
}

/*
$ java Test
0
1
2
3
4
Full
Full
4
3
2
1
0
Empty
Empty
*/
