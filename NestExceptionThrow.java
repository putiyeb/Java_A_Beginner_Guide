class Q extends Exception{
    public String toString(){
        return "GOOD";
    }
}

class P extends Q{
    public String toString(){
        return "BAD";
    }
}

class Test{
    public static void main(String args[]){
        try{
            for(int i = 0; i<3; i++){
                try{
                    if(i == 1){
                        throw new Q();
                    }else{
                        throw new P();
                    }
                }
                catch(Q exc){
                    throw exc;
                }
            }
        }
        catch(Q exc){
            System.out.println(exc);
        }
        catch(Throwable exc){
            System.out.println("1");
        }
    }
}


/*
$ java Test
BAD
*/


class Q extends Exception{
    public String toString(){
        return "GOOD";
    }
}

class P extends Q{
    public String toString(){
        return "BAD";
    }
}

class Test{
    public static void main(String args[]){
        try{
            for(int i = 0; i<3; i++){
                try{
                    if(i == 1){
                        throw new Q();
                    }else{
                        throw new P();
                    }
                }
                catch(Q exc){
                    throw exc;
                }
                finally{
                    System.out.println("3");
                }
            }
        }
        catch(Q exc){
            System.out.println(exc);
        }
        catch(Throwable exc){
            System.out.println("1");
        }
        finally{
            System.out.println("3");
        }
    }
}


/*
$ java Test
3
BAD
3

*/
