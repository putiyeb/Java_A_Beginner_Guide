import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Test{

    public static void main(String args[]){
        double a = 3;
        double b = 9;
        double c = 5;

        if(Math.pow(b, 2)>=4*a*c){
            System.out.println((-b+sqrt(pow(b,2)-4*a*c))/2);
            System.out.println((-b-sqrt(pow(b,2)-4*a*c))/2);
        }else{
            System.out.println("No the result");
        }

    }
}


/*
-2.20871215252208
-6.7912878474779195

*/



