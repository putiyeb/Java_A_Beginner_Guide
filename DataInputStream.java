import java.io.*;

class Test{
    public static void main(String args[]){
        try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))){
            boolean B = true;
            System.out.println("Writing: " + B);
            dataOut.writeBoolean(B);

            int I = 10;
            System.out.println("Writing: " + I);
            dataOut.writeInt(I);

            char C = 'd';
            System.out.println("Writing: " + C);
            dataOut.writeChar(C);

            double D = 4.55;
            System.out.println("Writing: " + D);
            dataOut.writeDouble(D);
        }
        catch(IOException exc){
            System.out.println("The I/O error is " + exc);
        }

        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))){
            System.out.println(dataIn.readBoolean());
            // System.out.println(dataIn.readBoolean());
            System.out.println(dataIn.readInt());
            System.out.println(dataIn.readChar());
            System.out.println(dataIn.readDouble());
        }
        catch(IOException exc){
            System.out.println("The I/O error is " + exc);
        }
    }
}

/*
Writing: true
Writing: 10
Writing: d
Writing: 4.55
true
10
d
4.55
*/
