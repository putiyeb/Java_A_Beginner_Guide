import java.io.*;

class Test{
    public static void main(String args[]) throws IOException{

        char ch;

        System.out.println("Please input the string: ");

        BufferedReader bf = new  BufferedReader(new InputStreamReader(System.in));

        do{
            ch = (char)bf.read();
            System.out.print(ch);
        }while(ch != -1);

        return;

    }
}


/*
$ java Test
Please input the string: 
sdfsdfrg gerg
sdfsdfrg gerg
vdg dsf wef 
vdg dsf wef 
*/



import java.io.*;

class Test{
    public static void main(String args[]) throws IOException{

        String str;

        System.out.println("Please input the string: ");

        BufferedReader bf = new  BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the 'stop' to quit");

        do{
            str = bf.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));

    }
}

/*
$ java Test
Please input the string: 
Enter the 'stop' to quit
dgeht
dgeht
hfhtrh
hfhtrh
ewu64y5wtefagh
ewu64y5wtefagh
ghmjhtgreffgn
ghmjhtgreffgn
sdfer gg trhyhtjy tyj y
sdfer gg trhyhtjy tyj y
stop
stop
$
*/
