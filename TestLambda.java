interface NumericFunc{
    boolean func(int n, int m);
}

class Test{
    public static void main(String args[]){

        NumericFunc nf = (n,m)->{
            if(m%n == 0){
                return true;
            }
            return false;
        };

        System.out.println(nf.func(3,7));
        System.out.println(nf.func(3,9));

    }
}

/*
false
true

*/

interface NumericFunc<T>{
    T func(T n);
}

class Test{
    public static void main(String args[]){

        NumericFunc<Integer> nf = (n)->{
            if(12%n == 0){
                return n;
            }
            return 0;
        };

        System.out.println(nf.func(3));
        System.out.println(nf.func(9));

    }
}


/*
3
0

*/


interface StringFunc{
    String func(String str);
}

class Test{

    static String st = "";

    public static void main(String args[]){

        StringFunc sf = (str)->{
            for(int i = 0;i<str.length(); i++){

                if(str.charAt(i) != ' '){
                    st += str.charAt(i);
                }

                
            }

            return st;
        };

        System.out.println(sf.func("sdf sndf wfjwnf wef"));
        sf.func("nfiwe fw w e");
        System.out.println(st);

    }
}


/*
sdfsndfwfjwnfwef
sdfsndfwfjwnfwefnfiwefwwe

*/



interface NumericFunc{
    boolean func(int i);
}

class MyIntNum{
    private int j;

    MyIntNum(int a){
        j = a;
    }

    boolean hasCommonFactor(int i){
        for(int n = 2; n<j && n<i; n++){
            if(i%n == 0 && j%n == 0){
                return true;
            }
        }
        return false;
    }
}

class Test{

    public static void main(String args[]){

        MyIntNum miu = new MyIntNum(12);

        NumericFunc nf = miu::hasCommonFactor;

        System.out.println(nf.func(9));
        System.out.println(nf.func(49));

    }
}


/*
true
false

*/
