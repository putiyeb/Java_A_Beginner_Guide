class Q extends Exception{
    public String toString(){
        return "GOOD";
    }
}

class P extends Q{
    public String toString(){
        return "BAD";
    }
}

class Test{
    public static void main(String args[]){
        try{
            throw new P();
        }
        catch(Q exc){
            System.out.println(exc);
        }
        catch(Throwable exc){
            System.out.println("1");
        }
    }
}


/*
$ java Test
BAD

*/


class Q extends Exception{
    public String toString(){
        return "GOOD";
    }
}

class P extends Q{
    public String toString(){
        return "BAD";
    }
}

class Test{
    public static void main(String args[]){
        try{
            throw new P();
        }
        // catch(Q exc){
        //     System.out.println(exc);
        // }
        catch(Throwable exc){
            System.out.println("1");
        }
    }
}


/*
$ java Test
1

*/


class Q extends Exception{
    public String toString(){
        return "GOOD";
    }
}

class P extends Q{
    public String toString(){
        return "BAD";
    }
}

class Test{
    public static void main(String args[]){
        try{
            throw new P();
        }
        catch(Throwable exc){
            System.out.println("1");
        }
        catch(Q exc){
            System.out.println(exc);
        }
    }
}

/*
$ javac Test.java
Test.java:21: error: exception Q has already been caught
        catch(Q exc){
        ^
1 error
*/


class Q extends Exception{
    public String toString(){
        return "GOOD";
    }
}

class P extends Q{
    public String toString(){
        return "BAD";
    }
}

class Test{
    public static void main(String args[]){
        try{
            throw new Q();
            throw new P();
        }
        catch(Q exc){
            System.out.println(exc);
        }
        catch(Throwable exc){
            System.out.println("1");
        }
    }
}


/*
$ javac Test.java
Test.java:17: error: unreachable statement
            throw new P();
            ^
1 error

*/
