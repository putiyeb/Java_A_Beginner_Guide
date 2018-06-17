package show;

class Tcircle extends test.Circle{
    public Tcircle(double a,double b, String c){
        super(a,b);
        name = c;
    }
    private String name;
    protected void getName(){
        System.out.println(name);
    } 
}

class Show{
    public static void main(String args[]){
        Tcircle a = new Tcircle(6,6,"Good morning");
        System.out.println(a.area());
        a.setWidth(8);
        System.out.println(a.area());
        // a.width = 10;
        a.getName();
    }
}


/* output:

113.03999999999999
*/
