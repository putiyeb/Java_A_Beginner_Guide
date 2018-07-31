interface NumericFunc<T>{
    boolean func(T t1, T t2);
}

class Test{

    public static void main(String args[]){
    
        NumericFunc<Integer> num;
    
        num = (n,m)->n>m;
    
        System.out.println(num.func(25,23));
        System.out.println(num.func(11,12));
        System.out.println(num.func(-36,0));

        NumericFunc<Double> num2;

        num2 = (n,m)->n<m;

        System.out.println(num2.func(25.45,23.23));

        NumericFunc<String> str;

        str = (n,m)->n.indexOf(m) != -1;

        System.out.println(str.func("sdnfj jnfff","j j"));
        System.out.println(str.func("sdnfjjnfff","j j"));

    }

}


/*
true
false
false
false
true
false

*/
