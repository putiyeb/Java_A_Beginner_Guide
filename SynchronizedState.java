import java.io.*;

class SumArray{
    int sum;

    int sumarr(int[] a){
        sum = 0;

        for(int i = 0; i<a.length; i++){
            sum += a[i];

            try{
                Thread.sleep(100);
            }
            catch(InterruptedException exc){
                System.out.println(exc);
            }
            System.out.println(sum);
        }

        return sum;
    }
}

class MyThreat implements Runnable{
    Thread thrd;
    public int[] arr2;
    static SumArray sa = new SumArray();

    MyThreat(String name,int[] b){
        thrd = new Thread(this,name);
        arr2 = b;
        thrd.start();
    }

    public void run(){
        System.out.println(thrd.getName() + " starting.");
        synchronized(sa){
            sa.sumarr(arr2);
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class Test {
    public static void main(String args[]) throws IOException{
        System.out.println("Main thread starting.");
        int[] c = {1,2,3,4};

        MyThreat mt1 = new MyThreat("hello1", c);
        MyThreat mt2 = new MyThreat("hello2", c);

        try{
            mt1.thrd.join();
            mt2.thrd.join();

        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }
    }
}


/*
Main thread starting.
hello1 starting.
hello2 starting.
1
3
6
10
hello1 terminating.
1
3
6
10
hello2 terminating.

*/
