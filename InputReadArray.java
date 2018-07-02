import java.io.*;

class Test{

    public static void main(String args[]) throws IOException{
        byte data[] = new byte[5];
        System.in.read(data);
        try{
        for(int i = 0; i<data.length; i++){
            System.out.print((char)data[i]);
        }
    }
        catch(Throwable exc){
            System.out.println("BAD");
        }
    }
}

/*
output:
$ java Test
ghmh
ghmh
*/
