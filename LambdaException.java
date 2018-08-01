import java.io.IOException;
import java.io.InputStream;

interface NumFunc{
    boolean func(InputStream rdr); //throws IOException;
}

class Test{

    public static void main(String args[]){

        NumFunc nf = (rdr)->{
            rdr.read();
            return true;
        };

    }

}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type IOException

	at Test.main(Test.java:13)

*/


import java.io.IOException;
import java.io.InputStream;

interface NumFunc{
    boolean func(InputStream rdr) throws IOException;
}

class Test{

    public static void main(String args[]){

        NumFunc nf = (rdr)->{
            rdr.read();
            return true;
        };

        System.out.println("ok");

    }
}


/*
ok

*/
