class genExcept {
    public void gen() {
        int[] a = { 3, 4, 45, 5, 6, 43, 56, 5, 5 };
        int[] b = { 546, 567, 0, 3564, 6 };
        try {
            for(int i = 0; i < a.length; i++){
                try{
                    int t = a[i]/b[i];
                    System.out.println(a[i] + " divided " + b[i] + " is " + t);
                }
                catch(ArithmeticException exc){
                    System.out.println("Can't divided by 0");
                    throw exc;
                }
                catch(IndexOutOfBoundsException exc){
                    System.out.println("Out of index");
                    throw exc;
                }
                finally{
                    System.out.println("Finally 1");
                }
            }
        } 
        catch (ArithmeticException exc) {
            System.out.println("Fatal Error");
            exc.printStackTrace();
            System.out.println(exc.toString());
        }
        finally{
            System.out.println("Finally 2");
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
$ java Exception
3 divided 546 is 0
Finally 1
4 divided 567 is 0
Finally 1
Can't divided by 0
Finally 1
Fatal Error
java.lang.ArithmeticException: / by zero
	at genExcept.gen(Exception.java:8)
	at Exception.main(Exception.java:38)
java.lang.ArithmeticException: / by zero
Finally 2
After
*/


class genExcept {
    public void gen() {
        int[] a = { 3, 4, 45, 5, 6, 43, 56, 5, 5 };
        int[] b = { 546, 567, 0, 3564, 6 };
        try {
            for(int i = 0; i < a.length; i++){
                try{
                    int t = a[i]/b[i];
                    System.out.println(a[i] + " divided " + b[i] + " is " + t);
                }
                catch(ArithmeticException exc){
                    System.out.println("Can't divided by 0");
                    // throw exc;
                }
                catch(IndexOutOfBoundsException exc){
                    System.out.println("Out of index");
                    throw exc;
                }
                finally{
                    System.out.println("Finally 1");
                }
            }
        } 
        catch (ArithmeticException exc) {
            System.out.println("Fatal Error");
            exc.printStackTrace();
            System.out.println(exc.toString());
        }
        finally{
            System.out.println("Finally 2");
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
$ java Exception
3 divided 546 is 0
Finally 1
4 divided 567 is 0
Finally 1
Can't divided by 0
Finally 1
5 divided 3564 is 0
Finally 1
6 divided 6 is 1
Finally 1
Out of index
Finally 1
Finally 2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	at genExcept.gen(Exception.java:8)
	at Exception.main(Exception.java:38)
*/
