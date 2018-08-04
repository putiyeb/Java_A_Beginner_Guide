package appfuncs.simplefuncs;

public class SimpleMathFuncs{

    public static int lcf(int a, int b){
        for(int i = 1; i < Math.abs(a) && i < Math.abs(b); i++){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }

    public static int gcf(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a > b ? b : a;

        // for(int i = min - 1; min/2 < i; i--){
        for(int i = 2; min/2 <= i; i++){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }

        return 1;
    }
}