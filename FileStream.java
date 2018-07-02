import java.io.*;

class Test{
    public static void main(String args[]){

        FileInputStream fin;

        if(args.length != 1){
            System.out.println("Usage: Test file");
            return;
        }

        try{
            fin = new FileInputStream(args[0]);
        }
        catch(FileNotFoundException exc){
            System.out.println("File Not Found");
            return;
        }

        int i;

        try{
            do{
                i = fin.read();
                System.out.print((char)i);
            }while(i != -1);
        }
        catch(IOException exc){
            System.out.println("Error read file");
        }
        finally{
            try{
                fin.close();
            }
            catch(IOException exc){
                System.out.println("Error close file");
            }
        }
    }
}

/*
$ java Test Q.class
Êþº¾6
<init>()VCodeLineNumberTabltoString()Ljava/lang/String;
SourceFile	Test.java
                         GOODQjava/lang/Exception *·±
°

$ java Test Q.class sdj
Usage: Test file


$ java Test sdfhu
File Not Found

*/


import java.io.*;

class Test{
    public static void main(String args[]){

    

        if(args.length != 1){
            System.out.println("Usage: Test file");
            return;
        }

        try{
            FileInputStream fin = new FileInputStream(args[0]);
        }
        catch(FileNotFoundException exc){
            System.out.println("File Not Found");
            return;
        }

        int i;

        try{
            do{
                i = fin.read();
                System.out.print((char)i);
            }while(i != -1);
        }
        catch(IOException exc){
            System.out.println("Error read file");
        }
        finally{
            try{
                fin.close();
            }
            catch(IOException exc){
                System.out.println("Error close file");
            }
        }
    }
}


/*
$ javac Test.java
Test.java:25: error: cannot find symbol
                i = fin.read();
                    ^
  symbol:   variable fin
  location: class Test
Test.java:34: error: cannot find symbol
                fin.close();
                ^
  symbol:   variable fin
  location: class Test
2 errors
*/



import java.io.*;

class Test{
    public static void main(String args[]){

        if(args.length != 1){
            System.out.println("Usage: Test file");
            return;
        }

        FileInputStream fin = null;
        int i;

        try{
            fin = new FileInputStream(args[0]);
            do{
                i = fin.read();
                System.out.print((char)i);
            }while(i != -1);
        }
        catch(FileNotFoundException exc){
            System.out.println("File Not Found");
            return;
        }
        catch(IOException exc){
            System.out.println("Error read file");
        }
        finally{
            try{
                fin.close();
            }
            catch(IOException exc){
                System.out.println("Error close file");
            }
        }
    }
}

/*
$ java Test
Usage: Test file

$ java Test sdf
File Not Found
Exception in thread "main" java.lang.NullPointerException
	at Test.main(Test.java:30)
  
$ java Test Q.class
Êþº¾6
<init>()VCodeLineNumberTabltoString()Ljava/lang/String;
SourceFile	Test.java
                         GOODQjava/lang/Exception *·±
°


*/


import java.io.*;

class Test{
    public static void main(String args[]){

        if(args.length != 1){
            System.out.println("Usage: Test file");
            return;
        }

        FileInputStream fin;
        int i;

        try{
            fin = new FileInputStream(args[0]);
            do{
                i = fin.read();
                System.out.print((char)i);
            }while(i != -1);
        }
        catch(FileNotFoundException exc){
            System.out.println("File Not Found");
            return;
        }
        catch(IOException exc){
            System.out.println("Error read file");
        }
        finally{
            try{
                fin.close();
            }
            catch(IOException exc){
                System.out.println("Error close file");
            }
        }
    }
}


/*
$ javac Test.java
Test.java:30: error: variable fin might not have been initialized
                fin.close();
                ^
1 error

*/



import java.io.*;

class Test{
    public static void main(String args[]){

        if(args.length != 1){
            System.out.println("Usage: Test file");
            return;
        }

        FileInputStream fin = null;
        int i;

        try{
            fin = new FileInputStream(args[0]);
            do{
                i = fin.read();
                System.out.print((char)i);
            }while(i != -1);
        }
        catch(FileNotFoundException exc){
            System.out.println("File Not Found");
            return;
        }
        catch(IOException exc){
            System.out.println("Error read file");
        }
        finally{
            try{
                if(fin != null){
                    fin.close();
                }
            }
            catch(IOException exc){
                System.out.println("Error close file");
            }
        }
    }
}


/*
$ java Test Q.cl
File Not Found
*/


import java.io.*;

class Test{
    public static void main(String args[]){

        if(args.length != 1){
            System.out.println("Usage: Test file");
            return;
        }

        FileInputStream fin = null;
        int i;

        try{
            fin = new FileInputStream(args[0]);
            do{
                i = fin.read();
                System.out.print((char)i);
            }while(i != -1);
        }
        catch(FileNotFoundException exc){
            System.out.println("File Not Found");
            return;
        }
        catch(IOException exc){
            System.out.println("Error read file");
        }
        finally{
            try{
                // if(fin != null){
                    fin.close();
                // }
            }
            catch(IOException exc){
                System.out.println("Error close file");
            }
            catch(Throwable exc){
                System.out.println("Unknown Error");
            }
        }
    }
}

/*
$ java Test Q.cl
File Not Found
Unknown Error
*/
