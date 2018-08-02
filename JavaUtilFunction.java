import java.util.function.Predicate;

class Test{

    public static void main(String args[]){

        Predicate<Double> pd = (n)->n<0;

        System.out.println(pd.test(45.76));
        System.out.println(pd.test(-45.76));

    }
}


/*
false
true

*/
