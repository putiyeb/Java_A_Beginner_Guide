import java.io.*;

class Test{
    public static void main(String args[]) throws IOException{

        String str = "";
        char[] ch = new char[10];

        try(FileReader fr = new FileReader("testdata3");){
            fr.read(ch);
            for(int i=0;i<ch.length;i++){
                str = str + ch[i];
            }
            System.out.println(str);
            fr.close();
        }

    }
}

/*
sdfergrgsd
*/



import java.io.*;

class Test{
    public static void main(String args[]) throws IOException{

        String str = "";

        try(BufferedReader br = new BufferedReader(new FileReader("testdata3"))){
            
            do{
                str = br.readLine();
                System.out.println(str);
            }while(str != null);

        }

    }
}

/*
sdfergrgsdferg
egerge
null
*/



import java.io.*;

class Test{
    public static void main(String args[]) throws IOException{

        String str = "";

        try(BufferedReader br = new BufferedReader(new FileReader("testdata3"))){

            while((str = br.readLine()) != null){
                System.out.println(str);
            }

        }

    }
}

/*
sdfergrgsdferg
egerge
*/
