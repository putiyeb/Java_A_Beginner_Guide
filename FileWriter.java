import java.io.*;

class Test{
    public static void main(String args[]) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter pw = new PrintWriter(System.out, true);

        String str;

        try(FileWriter fw = new FileWriter("testdata3")){

        do{
            str = bf.readLine();
            pw.println("\n\t" + str);
            if(str.equals("stop")) break;
            fw.write(str);
        }while(str.compareTo("stop") != 0);

        }
        catch(IOException exc){
            pw.println(exc);
        }

    }
}


/*
$ java Test
sdfergetg

	sdfergetg
wefrggt

	wefrggt
stop

	stop
$ 

$ cat testdata3
$

*/


import java.io.*;

class Test{
    public static void main(String args[]) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter pw = new PrintWriter(System.out, true);

        FileWriter fw = new FileWriter("testdata3",true);

        String str;

        try{

        do{
            str = bf.readLine();
            pw.println("\n\t" + str);
            if(str.equals("stop")) break;
            fw.write(str + "\r\n");
            fw.flush();
        }while(str.compareTo("stop") != 0);

        fw.close();

        }
        catch(IOException exc){
            pw.println(exc);
        }

    }
}

/*
$ java Test
sdferg

	sdferg
egerge

	egerge
stop

	stop
$

$ cat testdata3
sdfergrgsdferg
egerge
$

*/
