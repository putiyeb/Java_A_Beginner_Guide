package test;

interface a{
    int MyID();
    default int AdminID(){
        return 1;
    }
}

class b implements a{
    public int MyID(){
        return 2;
    }
}

class IDefaultM{
    public static void main(String args[]){
        b test = new b();
        System.out.println("My ID is: " + test.MyID());
        System.out.println("My Admin ID is: " + test.AdminID());
    }
}