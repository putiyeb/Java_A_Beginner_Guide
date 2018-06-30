class Exception{
    public static void main(String args[]){
        int[] a = new int[4];
        try{
            a[0] = 5;
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Index out-of-bound");
            System.out.println(exc);
        }
        System.out.println("After");
    }
}

/*
$ java Exception
Index out-of-bound
After
*/



class genExcept{
    public void gen(){
        int[] a = new int[4];
        a[7] = 5;
        // return;
    }
}

class Exception{
    public static void main(String args[]){
        genExcept a = new genExcept();
        try{
            a.gen();
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Index out-of-bound");
            System.out.println(exc);
        }
        System.out.println("After");
    }
}

/*
$ java Exception
Index out-of-bound
java.lang.ArrayIndexOutOfBoundsException: 7
After
*/


class genExcept{
    public void gen(){
        int[] a = new int[4];
        try{
            a[7] = 5;
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Not thrown out of method");
        }
        // return;
    }
}

class Exception{
    public static void main(String args[]){
        genExcept a = new genExcept();
        try{
            a.gen();
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Index out-of-bound");
            System.out.println(exc);
        }
        System.out.println("After");
    }
}

/*
$ java Exception
Not thrown out of method
After
*/



class genExcept{
    public void gen(){
        int[] a = new int[4];
        try{
            a[7] = 5.5;
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Not thrown out of method");
        }
        // return;
    }
}

class Exception{
    public static void main(String args[]){
        genExcept a = new genExcept();
        try{
            a.gen();
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Index out-of-bound");
            System.out.println(exc);
        }
        System.out.println("After");
    }
}


/*
$ javac Exception.java
Exception.java:5: error: incompatible types: possible lossy conversion from double to int
            a[7] = 5.5;
                   ^
1 error
*/


class genExcept{
    public void gen(){
        int[] a = {3,4,45,5,6,43,56,5,5};
        int[] b = {546,567,0,3564,6};
        // for(int i = 0; i< a.length;i++){
            try{
                for(int i = 0; i< a.length;i++){
                    System.out.println(a[i]/b[i]);
                }
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Out of bound!");
            }
            catch(ArithmeticException exc){
                System.out.println("Can't divided by 0");
                System.out.println(exc);
            }
        // }
        // return;
    }
}

class Exception{
    public static void main(String args[]){
        genExcept c = new genExcept();
        c.gen();
        System.out.println("After");
    }
}

/*
$ java -cp . Exception
0
0
Can't divided by 0
java.lang.ArithmeticException: / by zero
After
*/


class genExcept{
    public void gen(){
        int[] a = {3,4,45,5,6,43,56,5,5};
        int[] b = {546,567,0,3564,6};
        for(int i = 0; i< a.length;i++){
            try{
                System.out.println(a[i]/b[i]);
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Out of bound!");
            }
            catch(ArithmeticException exc){
                System.out.println("Can't divided by 0");
                System.out.println(exc);
            }
        }
        // return;
    }
}

class Exception{
    public static void main(String args[]){
        genExcept c = new genExcept();
        c.gen();
        System.out.println("After");
    }
}

/*
$ java Exception
0
0
Can't divided by 0
java.lang.ArithmeticException: / by zero
0
1
Out of bound!
Out of bound!
Out of bound!
Out of bound!
After
*/


class genExcept{
    public void gen(){
        int[] a = {3,4,45,5,6,43,56,5,5};
        int[] b = {546,567,0,3564,6};
        for(int i = 0; i < a.length; i++){
            try{
                double t = (double)a[i]/(double)b[i];
                System.out.println(a[i] + " divided " + b[i] + " is " + t);
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Out of bound!");
            }
            catch(ArithmeticException exc){
                System.out.println("Can't divided by 0");
                System.out.println(exc);
            }
        }
        // return;
    }
}

class Exception{
    public static void main(String args[]){
        genExcept c = new genExcept();
        c.gen();
        System.out.println("After");
    }
}

/*
$ java Exception
3 divided 546 is 0.005494505494505495
4 divided 567 is 0.007054673721340388
45 divided 0 is Infinity
5 divided 3564 is 0.0014029180695847362
6 divided 6 is 1.0
Out of bound!
Out of bound!
Out of bound!
Out of bound!
After
*/


class genExcept{
    public void gen(){
        int[] a = {3,4,45,5,6,43,56,5,5};
        int[] b = {546,567,0,3564,6};
        for(int i = 0; i < a.length; i++){
            try{
                double t = a[i]/b[i];
                System.out.println(a[i] + " divided " + b[i] + " is " + t);
                // if(i == 3){
                //     a[i] = 5.6;
                // }
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Out of bound!");
            }
            // catch(ArithmeticException exc){
            //     System.out.println("Can't divided by 0");
            //     System.out.println(exc);
            // }
            catch(Throwable exc){
                System.out.println("Unknown Error");
                System.out.println(exc);
            }
        }
        // return;
    }
}

class Test{
    public static void main(String args[]){
        genExcept c = new genExcept();
        c.gen();
        System.out.println("After");
    }
}

/*
$ java Exception
3 divided 546 is 0.0
4 divided 567 is 0.0
Unknown Error
java.lang.ArithmeticException: / by zero
5 divided 3564 is 0.0
6 divided 6 is 1.0
Out of bound!
Out of bound!
Out of bound!
Out of bound!
After
*/
class genExcept{
    public void gen(){
        int[] a = {3,4,45,5,6,43,56,5,5};
        int[] b = {546,567,0,3564,6};
        for(int i = 0; i < a.length; i++){
            try{
                double t = (double)a[i]/(double)b[i];
                System.out.println(a[i] + " divided " + b[i] + " is " + t);
                // if(i == 3){
                //     a[i] = 5.6;
                // }
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Out of bound!");
            }
            // catch(ArithmeticException exc){
            //     System.out.println("Can't divided by 0");
            //     System.out.println(exc);
            // }
            catch(Throwable exc){
                System.out.println("Unknown Error");
                System.out.println(exc);
            }
        }
        // return;
    }
}

class Test{
    public static void main(String args[]){
        genExcept c = new genExcept();
        c.gen();
        System.out.println("After");
    }
}

/*
$ java Exception
3 divided 546 is 0.005494505494505495
4 divided 567 is 0.007054673721340388
45 divided 0 is Infinity
5 divided 3564 is 0.0014029180695847362
6 divided 6 is 1.0
Out of bound!
Out of bound!
Out of bound!
Out of bound!
After
*/


