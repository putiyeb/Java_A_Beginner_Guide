package appstart.mymodappdemo;

import java.util.ServiceLoader;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.*;
import userfuncs.binaryfuncs.*;

public class MyModAppDemo {
    public static void main(String args[]){
        if(SupportFuncs.isFactor(2, 10)){
            System.out.println("2 is a factor of 10");
        }

        System.out.println(SimpleMathFuncs.lcf(8, 12));

        System.out.println(SimpleMathFuncs.gcf(8, 12));

        ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);

        BinaryFunc binOp = null;


        for(BinFuncProvider bfp : ldr){
            if(bfp.get().getName().equals("absPlus")){
                binOp = bfp.get();
                break;
            }
        }

        if(binOp != null){
            System.out.println("Result of absPlus function: " + binOp.func(12, -4));
        }
        else
        System.out.println("absPlus function not found");

        binOp = null;

        for(BinFuncProvider bfp : ldr){
            if(bfp.get().getName().equals("absMinus")){
                binOp = bfp.get();
                break;
            }
        }

        if(binOp != null){
            System.out.println("Result of absMinus function: " + binOp.func(12, -4));
        }
        else
        System.out.println("absMinus function not found");
    }
}