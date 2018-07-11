import java.io.*;

class Test {
    public static void main(String args[]) throws IOException{
        FileOutputStream fo = new FileOutputStream("3.txt");
        FileInputStream fi = new FileInputStream("1.txt");

        int i;

        try{
            do{
                i = fi.read();
                if(i == (int)' ') fo.write((int)'-');
                else if(i != -1) fo.write(i);
            }while(i != -1);
            fo.flush();
            fo.close();
            fi.close();
        }
        catch(IOException exc){
            System.out.println(exc);
        }
    }
}

/*
$ cat 1.txt 
asdfgh 5 无法稍等是否  sdf

$ cat 3.txt
asdfgh-5-无法稍等是否--sdf
*/
