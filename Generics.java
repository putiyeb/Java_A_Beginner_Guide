class Gen<T>{
    T ob;

    Gen(T o){
        ob = o;
    }

    T getob(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double> iOb;

        iOb = new Gen<Double>(88.0);

        System.out.println("value: " + iOb.getob());
        iOb.showType();
    }
}


/*
value: 88.0
Type of T is java.lang.Double

*/



class Gen<T>{
    T ob;

    Gen(T o){
        ob = o;
    }

    T getob(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double> iOb;

        iOb = new Gen<Double>(88);

        System.out.println("value: " + iOb.getob());
        iOb.showType();
    }
}



/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The constructor Gen<Double>(int) is undefined

	at Test.main(Test.java:21)

*/


class Gen<T>{
    T ob;

    Gen(T o){
        ob = o;
    }

    T getob(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double> iOb;

        iOb = new Gen<Double>(88.0);

        System.out.println("value: " + iOb.getob());
        iOb.showType();

        Gen<String> iOb2;

        iOb2 = new Gen<String>("Test");
        System.out.println("value: " + iOb2.getob());
        iOb2.showType();
    }
}


/*
value: 88.0
Type of T is java.lang.Double
value: Test
Type of T is java.lang.String


*/
