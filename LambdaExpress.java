interface MyValue{
    double getValue();
}

interface MyParamValue{
    double getValue(double v);
}

class Test{
    public static void main(String args[]){
        MyValue myVal;
        myVal = ()->45.67;
        System.out.println(myVal.getValue());

        MyParamValue mpVal;
        mpVal = (n)->1/n;

        double n = 45.32;
        System.out.println(mpVal.getValue(n));
        System.out.println(mpVal.getValue(34.65));
    }
}


/*
45.67
0.02206531332744925
0.02886002886002886

*/


interface NumericTest{
    boolean test(int i1, int i2);
}

class Test{
    public static void main(String args[]){
        NumericTest myVal;
        myVal = (i1,i2)->i1%2==0;
        System.out.println(myVal.test(4,5));
        System.out.println(myVal.test(5,5));

        myVal = (i1,i2)->i1<i2;
        System.out.println(myVal.test(4,5));
        System.out.println(myVal.test(5,5));

        myVal = (i1,i2)->(Math.abs(i1)==Math.abs(i2));
        System.out.println(myVal.test(4,5));
        System.out.println(myVal.test(5,-5));

    }
}


/*
true
false
true
false
false
true

*/



