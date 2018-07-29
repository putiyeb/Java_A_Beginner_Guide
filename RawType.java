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
        Gen<Integer> iOb = new Gen<Integer>(55);
        raw = iOb;
        double d = (Integer) raw.getob();
        System.out.println(d);
    }
}

/*
$ javac -Xlint Test.java
Test.java:17: warning: [rawtypes] found raw type: Gen
        Gen raw = new Gen(89);
        ^
  missing type arguments for generic class Gen<T>
  where T is a type-variable:
    T extends Object declared in class Gen
Test.java:17: warning: [rawtypes] found raw type: Gen
        Gen raw = new Gen(89);
                      ^
  missing type arguments for generic class Gen<T>
  where T is a type-variable:
    T extends Object declared in class Gen
Test.java:17: warning: [unchecked] unchecked call to Gen(T) as a member of the raw type Gen
        Gen raw = new Gen(89);
                  ^
  where T is a type-variable:
    T extends Object declared in class Gen
3 warnings

$ java Test.java
55.0
*/
