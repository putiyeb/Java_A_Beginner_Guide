import java.io.*;

class MyThreat extends Thread{

    MyThreat(String name){
        super(name);
        this.start();
    }

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

        MyThreat mt1 = new MyThreat("hello1");
        MyThreat mt2 = new MyThreat("hello2");
        MyThreat mt3 = new MyThreat("hello3");

        try{
            mt1.join();
            mt2.join();
            mt3.join();
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }


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
hello2 starting.
hello3 starting.
hello3, count is 0
hello1, count is 0
hello2, count is 0
hello3, count is 1
hello2, count is 1
hello1, count is 1
hello2, count is 2
hello1, count is 2
hello3, count is 2
hello2, count is 3
hello3, count is 3
hello1, count is 3
hello2, count is 4
hello3, count is 4
hello1, count is 4
hello2, count is 5
hello1, count is 5
hello3, count is 5
hello2, count is 6
hello1, count is 6
hello3, count is 6
hello2, count is 7
hello1, count is 7
hello3, count is 7
hello2, count is 8
hello1, count is 8
hello3, count is 8
hello1, count is 9
hello3, count is 9
hello2, count is 9
hello3 terminating.
hello1 terminating.
hello2 terminating.
Main thread ending.


*/
