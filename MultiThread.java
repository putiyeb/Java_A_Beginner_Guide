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

        MyThreat mt1 = new MyThreat("hello1");
        MyThreat mt2 = new MyThreat("hello2");
        MyThreat mt3 = new MyThreat("hello3");

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
hello1 starting.
.hello2 starting.
hello3 starting.
...hello2, count is 0
hello1, count is 0
hello3, count is 0
....hello3, count is 1
hello2, count is 1
hello1, count is 1
....hello3, count is 2
hello1, count is 2
hello2, count is 2
....hello3, count is 3
hello1, count is 3
hello2, count is 3
....hello3, count is 4
hello2, count is 4
hello1, count is 4
....hello1, count is 5
hello2, count is 5
hello3, count is 5
....hello2, count is 6
hello3, count is 6
hello1, count is 6
..Main thread ending.
hello2, count is 7
hello1, count is 7
hello3, count is 7
hello1, count is 8
hello3, count is 8
hello2, count is 8
hello2, count is 9
hello1, count is 9
hello3, count is 9
hello1 terminating.
hello2 terminating.
hello3 terminating.


*/
