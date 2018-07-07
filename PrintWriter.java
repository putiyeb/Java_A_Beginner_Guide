import java.io.*;

class Test{
    public static void main(String args[]) throws IOException{

        PrintWriter pw = new PrintWriter(System.out);

        int i = 10;
        double d = 23.567;

        pw.println(i+d);
        pw.println();

    }
}

/*
$ java Test
$ 
*/



import java.io.*;

class Test{
    public static void main(String args[]) throws IOException{

        PrintWriter pw = new PrintWriter(System.out,true);

        int i = 10;
        double d = 23.567;

        pw.println(i+d);
        pw.println();

    }
}

/*
$ java Test
33.567


*/
