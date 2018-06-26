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
