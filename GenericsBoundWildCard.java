Gen<T extends Number> {

    T obj;

    Gen(T ob){
        obj = ob;
    }

    boolean getBool(Gen<? extends A> aob){
        return true;
    }

    boolean getBool(Gen<? super B> bob){
        return false;
    }

}


class A{
    int a;
}

class B extends A{

}

class C extends B{

}

class D{
    int b;
}

class Test{
    public static void main(String args[]){
        Gen<A> a1 = new Gen<A>(new A());
        Gen<B> a2 = new Gen<B>(new B());
        Gen<C> a3 = new Gen<C>(new C()); 
        Gen<D> a4 = new Gen<D>(new D()); 

        System.out.println(a4.getBool(a3));
    }
}


/*
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Gen cannot be resolved to a type
	Gen cannot be resolved to a type
	Gen cannot be resolved to a type
	Gen cannot be resolved to a type
	Gen cannot be resolved to a type
	Gen cannot be resolved to a type
	Gen cannot be resolved to a type
	Gen cannot be resolved to a type

	at Test.main(Test.java:38)

*/



class Gen<T> {

    T obj;

    Gen(T ob){
        obj = ob;
    }

    boolean getBool(Gen<? extends A> aob){
        return true;
    }

    boolean getBool2(Gen<? super B> bob){
        return false;
    }

}


class A{
    int a;
}

class B extends A{

}

class C extends B{

}

class D{
    int b;
}

class Test{
    public static void main(String args[]){
        Gen<A> a1 = new Gen<A>(new A());
        Gen<B> a2 = new Gen<B>(new B());
        Gen<C> a3 = new Gen<C>(new C()); 
        Gen<D> a4 = new Gen<D>(new D()); 

        System.out.println(a4.getBool2(a3));
    }
}


/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method getBool2(Gen<? super B>) in the type Gen<D> is not applicable for the arguments (Gen<C>)

	at Test.main(Test.java:43)

*/



class Gen<T> {

    T obj;

    Gen(T ob){
        obj = ob;
    }

    boolean getBool(Gen<? extends A> aob){
        return true;
    }

    boolean getBool2(Gen<? super B> bob){
        return false;
    }

}


class A{
    int a;
}

class B extends A{

}

class C extends B{

}

class D{
    int b;
}

class Test{
    public static void main(String args[]){
        Gen<A> a1 = new Gen<A>(new A());
        Gen<B> a2 = new Gen<B>(new B());
        Gen<C> a3 = new Gen<C>(new C()); 
        Gen<D> a4 = new Gen<D>(new D()); 

        System.out.println(a4.getBool2(a2));
    }
}

/*
false

*/



class Gen<T> {

    T obj;

    Gen(T ob){
        obj = ob;
    }

    boolean getBool(Gen<? extends A> aob){
        return true;
    }

    boolean getBool(Gen<? super B> bob){
        return false;
    }

}


class A{
    int a;
}

class B extends A{

}

class C extends B{

}

class D{
    int b;
}

class Test{
    public static void main(String args[]){
        Gen<A> a1 = new Gen<A>(new A());
        Gen<B> a2 = new Gen<B>(new B());
        Gen<C> a3 = new Gen<C>(new C()); 
        Gen<D> a4 = new Gen<D>(new D()); 

        System.out.println(a4.getBool(a2));
    }
}



/*
$ javac Test.java 
Test.java:13: error: name clash: getBool(Gen<? super B>) and getBool(Gen<? extends A>) have the same erasure
    boolean getBool(Gen<? super B> bob){
            ^
1 error

*/
