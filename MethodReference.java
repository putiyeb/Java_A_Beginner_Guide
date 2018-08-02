
interface IntPredicate{
    boolean test(int i);
}

class MyIntPredicates{
    static boolean isPrime(int i){


        for(int a = 1;a<=Math.abs(i)/a;a++){
            if(Math.abs(i) % a == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int i){
        if(i%2 == 0){
            return true;
        }
        return false;
    }

    static boolean isPositive(int i){
        if(i>0){
            return true;
        }
        return false;
    }
}

class Test{

    static boolean numTest(IntPredicate IP, int i){
        return IP.test(i);
    }

    public static void main(String args[]){
        System.out.println(numTest(MyIntPredicates::isPrime, 9));
        System.out.println(numTest(MyIntPredicates::isEven, 9));
        System.out.println(numTest(MyIntPredicates::isPositive, 9));

        System.out.println(numTest(MyIntPredicates::isPrime, -9));
        System.out.println(numTest(MyIntPredicates::isEven, -9));
        System.out.println(numTest(MyIntPredicates::isPositive, -9));

        System.out.println(numTest(MyIntPredicates::isPrime, 8));
        System.out.println(numTest(MyIntPredicates::isEven, 8));
        System.out.println(numTest(MyIntPredicates::isPositive, 8));

    }
}


/*
false
false
true
false
false
false
false
true
true

*/



interface IntPredicate{
    boolean test(int i);
}

class MyIntPredicates{
    static boolean isPrime(int i){


        for(int a = 1;a<=Math.abs(i)/a;a++){
            if(Math.abs(i) % a == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int i){
        if(i%2 == 0){
            return true;
        }
        return false;
    }

    static boolean isPositive(int i){
        if(i>0){
            return true;
        }
        return false;
    }
}

class Test{

    static boolean numTest(IntPredicate IP, int i){
        return IP.test(i);
    }

    public static void main(String args[]){

        IntPredicate t1 = MyIntPredicates::isPrime;
        System.out.println(t1.test(9));
        System.out.println(numTest(MyIntPredicates::isEven, 9));
        System.out.println(numTest(MyIntPredicates::isPositive, 9));

        System.out.println(numTest(MyIntPredicates::isPrime, -9));
        System.out.println(numTest(MyIntPredicates::isEven, -9));
        System.out.println(numTest(MyIntPredicates::isPositive, -9));

        System.out.println(numTest(MyIntPredicates::isPrime, 8));
        System.out.println(numTest(MyIntPredicates::isEven, 8));
        System.out.println(numTest(MyIntPredicates::isPositive, 8));

    }
}

/*
false
false
true
false
false
false
false
true
true

*/
