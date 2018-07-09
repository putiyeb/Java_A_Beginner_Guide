import java.io.*;

class Test{
    public static void main(String args[]) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n;
            String str;

            double total = 0;

            System.out.println("Please enter the numbers of your need: ");
            str = br.readLine();
            try{
            n = Integer.parseInt(str);
            }
            catch(NumberFormatException exc){
                System.out.println("Invalid format");
                n = 0;
            }

            System.out.println("You need to enter " + n + " numbers");

            try{

            for(int i=0;i<n;i++){
                total += Integer.parseInt(br.readLine());
            }


            System.out.println("Total is: " + total);
            System.out.println("Average is: " + (total/n));

            }

            catch(NumberFormatException exc){
                System.out.println("Invalid format");
            }

        }
    }
}


/*
$ java Test
Please enter the numbers of your need: 
2  
You need to enter 2 numbers
345
6897
Total is: 7242.0
Average is: 3621.0
*/



