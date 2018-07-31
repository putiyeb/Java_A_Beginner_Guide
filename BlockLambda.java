interface NumericFunc{
    int func(int i);
}

class Test{

    public static void main(String args[]){
    
        NumericFunc num;
    
        num = (n)-> {

            int result = 1;

            n = n<0 ? -n : n;

            for(int i = 2; i<=n/i; i++)
                if(n%i == 0) {
                    result = i;
                    break;
                }

            return result;
        };
    
        System.out.println(num.func(25));
        System.out.println(num.func(11));
        System.out.println(num.func(-36));

    }

}


/*
5
1
2

*/



