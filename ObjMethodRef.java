
interface IntPredicate{
    boolean test(int i);
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

    static boolean numTest(IntPredicate IP, int i){
        return IP.test(i);
    }

    public static void main(String args[]){

        MyIntNum min1 = new MyIntNum(45);
        MyIntNum min2 = new MyIntNum(32);
        System.out.println(numTest(min1::isFactor, 5));
        System.out.println(numTest(min2::isFactor, 5));

    }
}


interface IntPredicate{
    boolean test(int i);
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

    static boolean numTest(IntPredicate IP, int i){
        return IP.test(i);
    }

    public static void main(String args[]){

        MyIntNum min1 = new MyIntNum(45);
        MyIntNum min2 = new MyIntNum(32);
        IntPredicate ip = min1::isFactor;
        System.out.println(numTest(ip, 5));
        ip = min2::isFactor;

        System.out.println(numTest(ip, 5));

    }
}


/*
true
false

*/
