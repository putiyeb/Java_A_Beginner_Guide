class Gen<T, V>{
    T ob;
    V obT;

    Gen(T o, V v){
        ob = o;
        obT = v;
    }

    T getob1(){
        return ob;
    }

    V getob2(){
        return obT;
    }

    void showType1(){
        System.out.println("Type is " + ob.getClass().getName());
    }

    void showType2(){
        System.out.println("Type is " + obT.getClass().getName());
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double, Integer> iOb;

        iOb = new Gen<Double, Integer>(88.0, 55);

        System.out.println("value: " + iOb.getob1());
        System.out.println("value: " + iOb.getob2());
        iOb.showType1();
        iOb.showType2();

    }
}


/*
value: 88.0
value: 55
Type is java.lang.Double
Type is java.lang.Integer

*/
