interface a{
    default int test(){
        return 0;
    }
    static int temp(){
        return 1;
    }
}

class b{
    public static void main(String args[]){
        System.out.println(a.temp());
    }
}