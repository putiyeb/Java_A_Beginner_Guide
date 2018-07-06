import java.io.*;

class Test{
    public static void main(String args[]){

        int A = 0;
        int B = 0;

        if(args.length != 2){
            System.out.println("Please Input the two files to diff!");
            return;
        }

        try(FileInputStream a = new FileInputStream(args[0]);
        FileInputStream b  = new FileInputStream(args[1])){
            
            do{
                B = b.read();
                A = a.read();


                int A_NUM = (int)'A';
                int Z_NUM = (int)'Z';

                if(A > A_NUM && A < Z_NUM){
                    A += 32;
                    System.out.println((char)A);
                }

                if(B > A_NUM && B < Z_NUM){
                    B += 32;
                }

                if(A != B){
                    System.out.println((char)A + " " + (char)B );
                    System.out.println("The files is different!");
                    return;
                }
            }while(A != -1 && B != -1);

            System.out.println("The files is same!");
        }
        catch(IOException exc){
            System.out.println(exc);
        }
    }
}

/*

??
$ java Test 1.txt 2.txt
a A
The files is different!
*/



import java.io.*;

class Test{
    public static void main(String args[]){

        int A = 0;
        int B = 0;

        if(args.length != 2){
            System.out.println("Please Input the two files to diff!");
            return;
        }

        try(FileInputStream a = new FileInputStream(args[0]);
        FileInputStream b  = new FileInputStream(args[1])){
            
            do{
                B = b.read();
                A = a.read();


                int A_NUM = (int)'A';
                int Z_NUM = (int)'Z';

                if(A >= A_NUM && A <= Z_NUM){
                    A += 32;
                }

                if(B >= A_NUM && B <= Z_NUM){
                    B += 32;
                }

                if(A != B){
                    System.out.println((char)A + " " + (char)B );
                    System.out.println("The files is different!");
                    return;
                }
            }while(A != -1 && B != -1);

            System.out.println("The files is same!");
        }
        catch(IOException exc){
            System.out.println(exc);
        }
    }
}


/*
$ java Test 1.txt 2.txt
The files is same!
*/
