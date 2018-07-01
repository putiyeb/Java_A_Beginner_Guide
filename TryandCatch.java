class Q extends Exception{
    public String toString(){
        return "GOOD";
    }
}

class Test{
    public static void main(String args[]){
        try{
            throw new Q();
        }
        catch(Q exc){
            System.out.println(exc);
        }
    }
}


/*
$ java Test
GOOD

*/

class Q extends Exception{
    public String toString(){
        return "GOOD";
    }
}

class Test{
    public static void main(String args[]){
        throw new Q();
        catch(Q exc){
            System.out.println(exc);
        }
    }
}


/*
$ javac Test.java
Test.java:10: error: 'catch' without 'try'
        catch(Q exc){
        ^
1 error
*/
