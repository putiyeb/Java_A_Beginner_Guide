class Gen<T extends Number , V extends Number>{
    T ob;
    V obT;

    Gen(T o, V v){
        ob = o;
        obT = v;
    }

    double reciprocal(Number n){
        return 1/n.doubleValue();
    }

    double fraction(Number m){
        return m.doubleValue()  - m.intValue();
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double, Integer> iOb;

        iOb = new Gen<Double, Integer>(88.45, 55);

        System.out.println("value: " + iOb.reciprocal(iOb.ob));
        System.out.println("value: " + iOb.reciprocal(iOb.obT));
        System.out.println("value: " + iOb.fraction(iOb.ob));
        System.out.println("value: " + iOb.fraction(iOb.obT));
        // Gen<Float, String> obJ = new Gen<Float, String>(43.5, "sdfnj");

    }
}


/*
value: 0.011305822498586773
value: 0.01818181818181818
value: 0.45000000000000284
value: 0.0

*/




class Gen<T extends Number , V extends Number>{
    T ob;
    V obT;

    Gen(T o, V v){
        ob = o;
        obT = v;
    }

    double reciprocal(Number n){
        return 1/n.doubleValue();
    }

    double fraction(Number m){
        return m.doubleValue()  - m.intValue();
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double, Integer> iOb;

        iOb = new Gen<Double, Integer>(88.45, 55);

        System.out.println("value: " + iOb.reciprocal(iOb.ob));
        System.out.println("value: " + iOb.reciprocal(iOb.obT));
        System.out.println("value: " + iOb.fraction(iOb.ob));
        System.out.println("value: " + iOb.fraction(iOb.obT));
        Gen<Float, String> obJ = new Gen<Float, String>(43.5, "sdfnj");

    }
}



/*
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Bound mismatch: The type String is not a valid substitute for the bounded parameter <V extends Number> of the type Gen<T,V>
	The constructor Gen<Float,String>(double, String) is undefined
	Bound mismatch: The type String is not a valid substitute for the bounded parameter <V extends Number> of the type Gen<T,V>

	at Test.main(Test.java:29)

*/
