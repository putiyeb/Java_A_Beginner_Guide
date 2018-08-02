
interface IntPredicate{
    boolean test(MyIntNum v, int i);
}

class MyIntNum{

    int i;

    MyIntNum(int a){
        i = a;
    }

    boolean isFactor(int i1){
        if(i%i1 == 0)
        return true;
        else
        return false;
    }
}

class Test{

    static boolean numTest(MyIntNum v, int i){
        return IP.test(v, i);
    }

    public static void main(String args[]){

        MyIntNum min1 = new MyIntNum(45);
        MyIntNum min2 = new MyIntNum(32);
        IntPredicate ip = MyIntNum::isFactor;
        System.out.println(numTest(min1, 5));
        ip = min2::isFactor;

        System.out.println(numTest(min2, 5));

    }
}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The type MyIntNum does not define isFactor(MyIntNum, int) that is applicable here

	at Test.main(Test.java:34)

*/




interface IntPredicate{
    boolean test(MyIntNum v, int i);
}

class MyIntNum{

    int i;

    MyIntNum(int a){
        i = a;
    }

    boolean isFactor(int i1){
        if(i%i1 == 0)
        return true;
        else
        return false;
    }
}

class Test{

    public static void main(String args[]){

        MyIntNum min1 = new MyIntNum(45);
        MyIntNum min2 = new MyIntNum(32);
        IntPredicate ip = MyIntNum::isFactor;
        System.out.println(ip.test(min1, 5));
        // ip = min2::isFactor;

        System.out.println(ip.test(min2, 5));

    }
}

/*
true
false

*/



interface IntPredicate{
    boolean test(MyIntNum v, int i);
}

class MyIntNum{

    int i;

    MyIntNum(int a){
        i = a;
    }

    boolean isFactor(int i1){
        if(i%i1 == 0)
        return true;
        else
        return false;
    }
}

class Test{

    public static boolean numTest(IntPredicate ip, MyIntNum m, int i){
        return ip.test(m, i);
    }

    public static void main(String args[]){

        MyIntNum min1 = new MyIntNum(45);
        MyIntNum min2 = new MyIntNum(32);
        IntPredicate ip = MyIntNum::isFactor;
        System.out.println(numTest(ip,min1, 5));
        System.out.println(numTest(ip,min2, 5));
    }
}

/*
true
false

*/
