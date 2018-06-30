class Exception{
    public static char getImport(String str) throws java.io.IOException{
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String args[]) {
        char ch;
        try{
            ch = getImport("Enter a letter");
        }
        catch(java.io.IOException exc){
            System.out.println("I/O exception occured.");
            ch = 'S';
        }
        System.out.println("You pressed " + ch);
    }
}


/*

$ java Exception
Enter a letter: 
sadfgm
You pressed s

$ java Exception
Enter a letter: 
4
You pressed 4

*/
