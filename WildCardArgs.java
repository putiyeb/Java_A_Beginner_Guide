class Gen<T extends Number>{
    T ob;

    Gen(T o){
        ob = o;
    }

    boolean absEquals(Gen<?> obJ){

        System.out.println(obJ.ob.doubleValue());
        System.out.println(ob.doubleValue());
        if(ob.doubleValue() == obJ.ob.doubleValue()){
            return true;
        }else{
            return false;
        }
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double> iOb;

        iOb = new Gen<Double>(88.0);
        Gen<Float> iOb2 = new Gen<Float>(Float.valueOf(88.0f));

        if(iOb.absEquals(iOb2)){
            System.out.println("The Absolute value is equal");
        }

        else System.out.println("The Absolute value is not equal");

    }
}



class Gen<T extends Number>{
    T ob;

    Gen(T o){
        ob = o;
    }

    boolean absEquals(Gen<?> obJ){

        System.out.println(obJ.ob.doubleValue());
        System.out.println(ob.doubleValue());
        if(ob.doubleValue() == obJ.ob.doubleValue()){
            return true;
        }else{
            return false;
        }
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double> iOb;

        iOb = new Gen<Double>(88.0);

        if(iOb.absEquals(new Gen<Float>(Float.valueOf(88.0f)))){
            System.out.println("The Absolute value is equal");
        }

        else System.out.println("The Absolute value is not equal");

    }
}




class Gen<T extends Number>{
    T ob;

    Gen(T o){
        ob = o;
    }

    boolean absEquals(Gen<?> obJ){

        System.out.println(obJ.ob.doubleValue());
        System.out.println(ob.doubleValue());
        if(ob.doubleValue() == obJ.ob.doubleValue()){
            return true;
        }else{
            return false;
        }
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double> iOb;

        iOb = new Gen<Double>(88.0);

        if(iOb.absEquals(new Gen<Float>(88.0f))){
            System.out.println("The Absolute value is equal");
        }

        else System.out.println("The Absolute value is not equal");

    }
}


/*
88.0
88.0
The Absolute value is equal

*/



class Gen<T extends Number>{
    T ob;

    Gen(T o){
        ob = o;
    }

    boolean absEquals(Gen<?> obJ){

        System.out.println(obJ.ob.doubleValue());
        System.out.println(ob.doubleValue());
        if(ob.doubleValue() == obJ.ob.doubleValue()){
            return true;
        }else{
            return false;
        }
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double> iOb;

        iOb = new Gen<Double>(88.05);

        if(iOb.absEquals(new Gen<Float>(88.05f))){
            System.out.println("The Absolute value is equal");
        }

        else System.out.println("The Absolute value is not equal");

    }
}


/*
88.05000305175781
88.05
The Absolute value is not equal

*/



class Gen<T>{
    T ob;

    Gen(T o){
        ob = o;
    }

    boolean absEquals(Gen<?> obJ){

        System.out.println(obJ.ob.doubleValue());
        System.out.println(ob.doubleValue());
        if(ob.doubleValue() == obJ.ob.doubleValue()){
            return true;
        }else{
            return false;
        }
    }
}

class Test{
    public static void main(String args[]){
        Gen<Double> iOb;

        iOb = new Gen<Double>(88.05);

        if(iOb.absEquals(new Gen<Float>(88.05f))){
            System.out.println("The Absolute value is equal");
        }

        else System.out.println("The Absolute value is not equal");

    }
}


/*
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The method doubleValue() is undefined for the type capture#1-of ?
	The method doubleValue() is undefined for the type T
	The method doubleValue() is undefined for the type T
	The method doubleValue() is undefined for the type capture#2-of ?

	at Gen.absEquals(Test.java:10)
	at Test.main(Test.java:26)

*/
