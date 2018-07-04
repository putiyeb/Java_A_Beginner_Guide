import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Test{
    public static void main(String args[]){
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int i;

        if(args.length != 2){
            System.out.println("At least two files");
            return;
        }

        try{
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1], true);
            do{
                i = fin.read();
                if(i != -1) fout.write(i);
            }while(i != -1);
        }
        catch(IOException exc){
            System.out.println("The IO error is:" + exc);
        }
        finally{
            try{
                if(fin != null) fin.close();
            }
            catch(IOException exc){
                System.out.println("Cannot close the input file");
            }
            try{
                if(fout != null) fout.close();
            }
            catch(IOException exc){
                System.out.println("Cannot close the output file");
            }
        }

    }
}

/*
$ java Test 1.txt 2.txt
$ cat 2.txt
sdfrg rg erger df234245
sdfrg rg erger df234245
*/
