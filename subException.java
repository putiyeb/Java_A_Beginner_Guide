class NotIntResultException extends Exception{
    public int a;
    public int b;

    NotIntResultException(int c, int d){
        a = c;
        b = d;
    }

    public String toString(){
        return a + " divide " + b + " is not integer";
    }
}

class Test{
    public static void main(String args[]){
        int[] i = {24,23,45,78677,56,54,34,5};
        int[] j = {3,22,5,0,6,4565,4};
        for(int k = 0; k<i.length; k++){
            try{
                if(i[k]%j[k] != 0)
                throw new NotIntResultException(i[k], j[k]);
            }
            catch(NotIntResultException exc){
                System.out.println(exc);
            }
            catch(ArithmeticException exc){
                System.out.println("Can't divide the zero");
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Out of bound");
            }
        }
    }
}


/*
$ java Test
23 divide 22 is not integer
Can't divide the zero
56 divide 6 is not integer
54 divide 4565 is not integer
34 divide 4 is not integer
Out of bound
*/
