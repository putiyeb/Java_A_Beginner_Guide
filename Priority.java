import java.io.*;

class MyThreat extends Thread{

    public int count;
    public static boolean stop;
    public static String currentName;

    MyThreat(String name){
        super(name);
        count = 0;
    }

    public void run(){

        System.out.println(this.getName() + " starting.");
        // try{
        //     this.start();
            do{
                count++;

                // if(currentName.compareTo(this.getName()) != 0){
                //     currentName = this.getName();
                // }

            }while(stop == false && count < 1000000000);

            stop=true;
        // }
        // catch(InterruptedException exc){
        //     System.out.println(exc);
        // }
        System.out.println(this.getName() + " terminating.");
    }
}

class Test {
    public static void main(String args[]) throws IOException{
        System.out.println("Main thread starting.");

        MyThreat mt1 = new MyThreat("hello1");
        MyThreat mt2 = new MyThreat("hello2");
        MyThreat mt3 = new MyThreat("hello3");
        MyThreat mt4 = new MyThreat("hello4");
        MyThreat mt5 = new MyThreat("hello5");

        mt1.setPriority(Thread.NORM_PRIORITY+2);
        mt2.setPriority(Thread.NORM_PRIORITY-2);

        try{

            mt1.start();
            mt2.start();
            mt3.start();
            mt4.start();
            mt5.start();
            mt1.join();
            mt2.join();
            mt3.join();
            mt4.join();
            mt5.join();

        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }

        System.out.println(mt1.count);
        System.out.println(mt2.count);
        System.out.println(mt3.count);
        System.out.println(mt4.count);
        System.out.println(mt5.count);


        // do{
        //     System.out.print(".");

        //     try{
        //         Thread.sleep(100);
        //     }
        //     catch(InterruptedException exc){
        //         System.out.println("Main thread interrupted.");
        //     }
        // }while(mt1.isAlive() || mt2.isAlive() || mt3.isAlive());

        System.out.println("Main thread ending.");
    }
}


/*
Main thread starting.
hello1 starting.
hello3 starting.
hello4 starting.
hello2 starting.
hello5 starting.
hello3 terminating.
hello2 terminating.
hello1 terminating.
hello5 terminating.
hello4 terminating.
903875
739287
1000000000
774850
444138
Main thread ending.



Main thread starting.
hello2 starting.
hello1 starting.
hello3 starting.
hello4 starting.
hello4 terminating.
hello3 terminating.
hello1 terminating.
hello2 terminating.
hello5 starting.
hello5 terminating.
1000000000
227555
1000000000
1000000000
1
Main thread ending.



Main thread starting.
hello1 starting.
hello2 starting.
hello3 starting.
hello4 starting.
hello5 starting.
hello2 terminating.
hello3 terminating.
hello1 terminating.
hello5 terminating.
hello4 terminating.
1000000000
327647
705812
763508
1000000000
Main thread ending.



Main thread starting.
hello1 starting.
hello2 starting.
hello3 starting.
hello4 starting.
hello5 starting.
hello4 terminating.
hello5 terminating.
hello2 terminating.
hello3 terminating.
hello1 terminating.
859329
806829
618985
1000000000
284931
Main thread ending.


Main thread starting.
hello2 starting.
hello3 starting.
hello1 starting.
hello4 starting.
hello5 starting.
hello3 terminating.
hello2 terminating.
hello1 terminating.
hello4 terminating.
hello5 terminating.
743764
1142426
1000000000
642165
570022
Main thread ending.

*/
