package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo {
    public static void main(String args[]){
        if(SimpleMathFuncs.isFactor(2, 10)){
            System.out.println("2 is a factor of 10");
        }

        System.out.println(SimpleMathFuncs.lcf(8, 12));

        System.out.println(SimpleMathFuncs.gcf(8, 12));
    }
}