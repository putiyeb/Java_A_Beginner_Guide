class Gen<T>{

    T ob;

    Gen(T o){
        ob = o;
        T vals[] = new T[10];
    }

    T getob(){
        return ob;
    }

}

class Test{
    public static void main (String args[]){
        Gen raw = new Gen(89);
        Gen<Integer> iOb = new Gen<Integer>(55);
        double d = (Integer) raw.getob();
        System.out.println(d);
        iOb = raw;
    }
}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Cannot create a generic array of T

	at Gen.<init>(Test.java:7)
	at Test.main(Test.java:18)

*/

class Gen<T>{

    T ob;

    Gen(T o){
        ob = o;
        // T vals[] = new T[10];
    }

    T getob(){
        return ob;
    }

}

class Test{
    public static void main (String args[]){
        Gen raw = new Gen(89);
        Gen<Integer> iOb = new Gen<Integer>(55);
        double d = (Integer) raw.getob();
        System.out.println(d);
        Gen<Integer> iOb2[] = new Gen<Integer>[10];
        iOb = raw;
    }
}


/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Cannot create a generic array of Gen<Integer>

	at Test.main(Test.java:22)

*/



class Gen<T>{

    T ob;

    Gen(T o){
        ob = o;
        // T vals[] = new T[10];
    }

    T getob(){
        return ob;
    }

}

class Test{
    public static void main (String args[]){
        Gen raw = new Gen(89);
        Gen<Integer> iOb = new Gen<Integer>(55);
        double d = (Integer) raw.getob();
        System.out.println(d);
        Gen<?> iOb2[] = new Gen<?>[10];
        iOb = raw;
    }
}


/*
89.0

*/
