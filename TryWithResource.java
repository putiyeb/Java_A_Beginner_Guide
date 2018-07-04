import java.io.*;

class Test{
    public static void main(String args[]){
        int i;

        if(args.length != 1){
            System.out.println("Only one file");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0])){
            do{
                i = fin.read();
                if(i != -1) System.out.print((char)i);;
            }while(i != -1);
        }
        catch(IOException exc){
            System.out.println("The IO error is:" + exc);
        }
    }
}


/*
$ java Test 1.txt
sdfrg rg erger df234245
*/


import java.io.*;

class Test{
    public static void main(String args[]){
        int i;

        if(args.length != 2){
            System.out.println("At least two file");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1])){
            do{
                i = fin.read();
                if(i != -1) fout.write(i);
            }while(i != -1);
        }
        catch(IOException exc){
            System.out.println("The IO error is:" + exc);
        }
    }
}


/*
$ java Test 1.txt 2.txt
$ cat 2.txt
sdfrg rg erger df234245
*/
