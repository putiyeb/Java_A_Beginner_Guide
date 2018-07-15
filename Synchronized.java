import java.io.*;

class SumArray{
    int sum;

    synchronized int sumarr(int[] a){
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

    MyThreat(String name,int[] b){
        thrd = new Thread(this,name);
        arr2 = b;
        thrd.start();
    }

    public void run(){
        System.out.println(thrd.getName() + " starting.");
        SumArray sa = new SumArray();
        sa.sumarr(arr2);
        System.out.println(thrd.getName() + " terminating.");
    }
}

class Test {
    public static void main(String args[]) throws IOException{
        System.out.println("Main thread starting.");
        int[] c = {3423,43,5,46,76,87775,64,3,2,5,67,897,6,75,4534,5,678,76,54,0,867,5,4876,5432,6,75,643,567};

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
3423
3423
3466
3466
3471
3471
3517
3517
3593
3593
91368
91368
91432
91432
91435
91435
91437
91437
91442
91442
91509
91509
92406
92406
92412
92412
92487
92487
97021
97021
97026
97026
97704
97704
97780
97780
97834
97834
97834
97834
98701
98701
98706
98706
103582
103582
109014
109014
109020
109020
109095
109095
109738
109738
110305
110305
hello2 terminating.
hello1 terminating.


*/




import java.io.*;

class SumArray{
    int sum;

    synchronized int sumarr(int[] a){
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
        sa.sumarr(arr2);
        System.out.println(thrd.getName() + " terminating.");
    }
}

class Test {
    public static void main(String args[]) throws IOException{
        System.out.println("Main thread starting.");
        int[] c = {3423,43,5,46,76,87775,64,3,2,5,67,897,6,75,4534,5,678,76,54,0,867,5,4876,5432,6,75,643,567};

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
3423
3466
3471
3517
3593
91368
91432
91435
91437
91442
91509
92406
92412
92487
97021
97026
97704
97780
97834
97834
98701
98706
103582
109014
109020
109095
109738
110305
hello1 terminating.
3423
3466
3471
3517
3593
91368
91432
91435
91437
91442
91509
92406
92412
92487
97021
97026
97704
97780
97834
97834
98701
98706
103582
109014
109020
109095
109738
110305
hello2 terminating.


*/



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
        sa.sumarr(arr2);
        System.out.println(thrd.getName() + " terminating.");
    }
}

class Test {
    public static void main(String args[]) throws IOException{
        System.out.println("Main thread starting.");
        int[] c = {3423,43,5,46,76,87775,64,3,2,5,67,897,6,75,4534,5,678,76,54,0,867,5,4876,5432,6,75,643,567};

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
3423
3423
3509
3514
3519
3565
3611
3611
3763
3763
179313
179313
179441
179441
179447
179447
179451
179451
179461
179461
179595
179595
181389
181395
181401
181476
181551
186085
190619
190619
190629
190629
191985
191985
192137
192137
192245
192245
192245
192245
193979
193979
193989
193989
203741
203741
214605
214605
214617
214617
214767
214767
216053
216620
217187
hello2 terminating.
217187
hello1 terminating.


*/
