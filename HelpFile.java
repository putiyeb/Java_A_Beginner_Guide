import java.io.*;

class Help {
    String helpfile;

    Help(String fname){
        helpfile = fname;
    }

    String getSelection(){
        String str = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Please enter the topic:");
            str = br.readLine();

        }
        catch(IOException exc){
            System.out.println("Error reading console");
        }

        return str;
    }

    boolean helpOn(String what){
        int ch;
        String topic, info;
        try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))){
            do{
                ch = helpRdr.read();
    
                if(ch == '#'){
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0){
                        do{
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        }while(info != null && (info.compareTo("") != 0));
    
                        return true;
                    }
                }
            }while(ch != -1);
        }
        catch(IOException exc){
            System.out.println(exc);
            return false;
        }
    
        return false;
    }

}

class Test {
    public static void main(String args[]) throws IOException{
        Help h = new Help("Help.txt");
        String topic;
        System.out.println("Try the Help, enter the 'stop' to end");
        do{
            topic = h.getSelection();
            if(h.helpOn(topic)) System.out.println("good");
            else System.out.println("bad");
        }while(!topic.equals("stop"));
    }
}


/*
$ java Test
Try the Help, enter the 'stop' to end
Please enter the topic:
fer
bad
Please enter the topic:
grhth
bad
Please enter the topic:
if
sdfef
ergreg
rtrtg

good
Please enter the topic:
do
frefer

good
Please enter the topic:
stop
bad
*/




import java.io.*;

class Help {
    String helpfile;

    Help(String fname){
        helpfile = fname;
    }

    String getSelection(){
        String str = "";
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Please enter the topic:");
            str = br.readLine();

        }
        catch(IOException exc){
            System.out.println("Error reading console");
        }

        return str;
    }

    boolean helpOn(String what){
        int ch;
        String topic, info;
        try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))){
            do{
                ch = helpRdr.read();
    
                if(ch == '#'){
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0){
                        do{
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        }while(info != null && (info.compareTo("") != 0));
    
                        return true;
                    }
                }
            }while(ch != -1);
        }
        catch(IOException exc){
            System.out.println(exc);
            return false;
        }
    
        return false;
    }

}

class Test {
    public static void main(String args[]) throws IOException{
        Help h = new Help("Help.txt");
        String topic;
        System.out.println("Try the Help, enter the 'stop' to end");
        do{
            topic = h.getSelection();
            if(h.helpOn(topic)) System.out.println("good");
            else System.out.println("bad");
        }while(!topic.equals("stop"));
    }
}


/*
$ java Test
Please enter the topic:
fv
Please enter the topic:
Error reading console
bad
Please enter the topic:
Error reading console
bad
Please enter the topic:
Error reading console
bad
Please enter the topic:
Error reading console
bad
Please enter the topic:
Error reading console
bad
Please enter the topic:
.
.
.

*/
