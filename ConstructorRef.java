
interface IntPredicate{
    MyIntNum test(int i);
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

        IntPredicate ip = MyIntNum::new;

        MyIntNum MIN = ip.test(4);

        System.out.println(MIN.isFactor(2));
        System.out.println(MIN.isFactor(3));

    }
}


/*
true
false

*/
