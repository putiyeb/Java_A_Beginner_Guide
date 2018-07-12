import java.io.*;

class MyThreat implements Runnable{
    String thrdName;

    MyThreat(String name){
        thrdName = name;
    }

    public void run(){
        System.out.println(thrdName + " starting.");

        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }
        System.out.println(thrdName + " terminating.");
    }
}

class Test {
    public static void main(String args[]) throws IOException{
        System.out.println("Main thread starting.");

        MyThreat mth = new MyThreat("test");
        Thread newThrd = new Thread(mth);
        newThrd.start();

        for(int i=0; i<50; i++){
            System.out.print(".");
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
.test starting.
...In test, count is 0
....In test, count is 1
....In test, count is 2
....In test, count is 3
....In test, count is 4
....In test, count is 5
....In test, count is 6
....In test, count is 7
....In test, count is 8
...In test, count is 9
test terminating.
...........Main thread ending.
*/


import java.io.*;

class MyThreat implements Runnable{
    String thrdName;

    MyThreat(String name){
        thrdName = name;
    }

    public void run(){
        System.out.println(thrdName + " starting.");

        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }
        System.out.println(thrdName + " terminating.");
    }
}

class Test {
    public static void main(String args[]) throws IOException{
        System.out.println("Main thread starting.");

        MyThreat mth = new MyThreat("test");
        Thread newThrd = new Thread(mth);
        newThrd.start();

        for(int i=0; i<30; i++){
            System.out.print(".");
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
.test starting.
...In test, count is 0
....In test, count is 1
....In test, count is 2
....In test, count is 3
....In test, count is 4
....In test, count is 5
....In test, count is 6
..Main thread ending.
In test, count is 7
In test, count is 8
In test, count is 9
test terminating.

*/
