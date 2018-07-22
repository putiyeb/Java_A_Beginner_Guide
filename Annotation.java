@Deprecated
class Anno{
    private String msg;

    Anno(String m){
        msg = m;
    }

    @Deprecated
    String getMsg(){
        return msg;
    }
}


class Test{

    public static void main(String args[]){
        Anno an = new Anno("bad");
        System.out.println(an.getMsg());
    }
}


/*
javac Test.java 
Note: Test.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

javac -Xlint Test.java 
Test.java:20: warning: [deprecation] Anno in unnamed package has been deprecated
        Anno an = new Anno("bad");
        ^
Test.java:20: warning: [deprecation] Anno in unnamed package has been deprecated
        Anno an = new Anno("bad");
                      ^
Test.java:21: warning: [deprecation] getMsg() in Anno has been deprecated
        System.out.println(an.getMsg());
                             ^
3 warnings

java Test
bad

*/
