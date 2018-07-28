class Gen<T>{

    T ob;

    Gen(T o){
        ob = o;
    }

    T getob(){
        return ob;
    }

}

class Test{
    public static void main (String args[]){
        Gen raw = new Gen(89.6);
        double d = (Double) raw.getob();
        System.out.println(d);
    }
}


/*
89.6

*/



class Gen<T>{

    T ob;

    Gen(T o){
        ob = o;
    }

    T getob(){
        return ob;
    }

}

class Test{
    public static void main (String args[]){
        Gen raw = new Gen(89.6f);
        double d = (Float) raw.getob();
        System.out.println(d);
    }
}


/*
89.5999984741211

*/


class Gen<T>{

    T ob;

    Gen(T o){
        ob = o;
    }

    T getob(){
        return ob;
    }

}

class Test{
    public static void main (String args[]){
        Gen raw = new Gen(89);
        double d = (Float) raw.getob();
        System.out.println(d);
    }
}



/*
Exception in thread "main" java.lang.ClassCastException: java.base/java.lang.Integer cannot be cast to java.base/java.lang.Float
	at Test.main(Test.java:18)

*/


