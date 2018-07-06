import java.io.*;

class Test{
    public static void main(String args[]){
        char data[] = {'W','E','D','d'};

        try(RandomAccessFile RAF = new RandomAccessFile("testdata2","rw")){
            for(int i=0;i<data.length;i++){
                RAF.write(data[i]);
            }

            RAF.seek(0);
            System.out.println((char)RAF.read());
            RAF.seek(2);
            System.out.println((char)RAF.read());
            RAF.seek(1);
            System.out.println((char)RAF.read());
            System.out.println((char)RAF.read());
        }catch(IOException exc){
            System.out.println(exc);
        }
    }
}


/*
W
D
E
D
*/


import java.io.*;

class Test{
    public static void main(String args[]){
        double data[] = {234.345,345435.45,456456.645,34456.4564};

        try(RandomAccessFile RAF = new RandomAccessFile("testdata2","rw")){
            for(int i=0;i<data.length;i++){
                RAF.writeDouble(data[i]);
            }

            RAF.seek(0);
            System.out.println(RAF.readDouble());
            RAF.seek(8*2);
            System.out.println(RAF.readDouble());
            RAF.seek(8*1);
            System.out.println(RAF.readDouble());
            System.out.println(RAF.readDouble());
        }catch(IOException exc){
            System.out.println(exc);
        }
    }
}


/*
234.345
456456.645
345435.45
456456.645
*/
