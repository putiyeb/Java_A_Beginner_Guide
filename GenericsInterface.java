interface GenInter<T>{
    public boolean contains(T O);
}

class MyClass<T> implements GenInter<T>{
    T[] arrayRef;

    MyClass(T[] o){
        arrayRef = o;
    }

    public boolean contains(T o){
        for(T x: arrayRef){
            if(x.equals(o)) return true;
        }
        return false;
    }
}

class Test{
    public static void main(String args[]){
        Integer[] i = {12,45,567,786};
        MyClass<Integer> mc = new MyClass<Integer>(i);

        if(mc.contains(3)){
            System.out.println("The array i contains 3 ");
        }else{
            System.out.println("The array i doesn't contains 3");
        }

        if(mc.contains(12)){
            System.out.println("The array i contains 12 ");
        }else{
            System.out.println("The array i doesn't contains 12");
        }
    }
}

/*
The array i doesn't contains 3
The array i contains 12 

*/
