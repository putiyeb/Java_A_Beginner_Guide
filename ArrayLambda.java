
interface NumFunc<T>{
    void func(T[] a);
}

class Test{

    public static void main(String args[]){

        NumFunc<Double> nf = (n)->{
            for(int i = 0;i<n.length; i++){
                System.out.println(n[i]+1);
            }
        };

        Double[] d = {34.23,234.56,234.345};

        nf.func(d);

    }
}




interface NumFunc<T>{
    void func(T[] a);
}

class Test{

    public static void main(String args[]){

        NumFunc<Double> nf = (Double[] n)->{
            for(int i = 0;i<n.length; i++){
                System.out.println(n[i]+1);
            }
        };

        Double[] d = {34.23,234.56,234.345};

        nf.func(d);

    }
}



/*
35.23
235.56
235.345

*/


