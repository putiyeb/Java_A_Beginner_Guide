class genExcept {
    public void gen() {
        int[] a = { 3, 4, 45, 5, 6, 43, 56, 5, 5 };
        int[] b = { 546, 567, 0, 3564, 6 };
        try {
            System.out.println("Throw a exception");
            throw new ArithmeticException();
        } 
        catch (ArithmeticException exc) {
            System.out.println("Can't divided by 0");
            System.out.println(exc);
        }
    }
}

class Exception{
    public static void main(String args[]) {
        genExcept c = new genExcept();
        c.gen();
        System.out.println("After");
    }
}

/*
output:
$ java Exception
Throw a exception
Can't divided by 0
java.lang.ArithmeticException
After
*/
