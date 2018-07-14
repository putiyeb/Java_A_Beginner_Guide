import java.io.*;

class MyThreat extends Thread{

    MyThreat(String name){
        super(name);
        this.start();
    }
    // public static MyThreat CreateAndRun(String name){
    //     MyThreat myThrd = new MyThreat(name);
    //     myThrd.thrd.start();
    //     return myThrd; //return myThrd for control the thread in the future
    // }

    public void run(){
        System.out.println(this.getName() + " starting.");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println(this.getName() + ", count is " + count);
            }
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }
        System.out.println(this.getName() + " terminating.");
    }
}

class Test {
    public static void main(String args[]) throws IOException{
        System.out.println("Main thread starting.");

        MyThreat mt = new MyThreat("hello");

        for(int i=0; i<30; i++){
            System.out.print(".");

            // if((i%2) == 0){
            //     mt.thrd.suspend();
            // }

            // if((i%2) != 0){
            //     mt.thrd.resume();
            // }

            try{
                Thread.sleep(100);
            }
            catch(InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}


/*
Main thread starting.
.hello starting.
...hello, count is 0
....hello, count is 1
....hello, count is 2
....hello, count is 3
....hello, count is 4
....hello, count is 5
....hello, count is 6
..Main thread ending.
hello, count is 7
hello, count is 8
hello, count is 9
hello terminating.

*/
