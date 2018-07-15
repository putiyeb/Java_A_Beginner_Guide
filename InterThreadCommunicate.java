class TickTock{
    String state = "";

    synchronized void tick(){
        if(state.equals("ticked")){
            notify();
            return;
        }
        System.out.print("Tick\t");
        state = "ticked";
        notify();
        try{
            if(state.compareTo("ticked") == 0)
            {
                wait();
            }
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }

    }

    synchronized void tock(MyThreat m){
        if(state.equals("tocked")){
            notify();
            return;
        }
        System.out.print("Tock\n");
        state = "tocked";
        try{
            notify();

            Thread.sleep(100);
            if(state.compareTo("tocked") == 0 && m.thrd.isAlive())
            {
                wait();
            }
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }

    }
}

class MyThreat implements Runnable{
    Thread thrd;
    MyThreat l;
    static TickTock tt = new TickTock();
    MyThreat(String name, MyThreat... my){
        thrd = new Thread(this,name);
        thrd.start();

        if(my.length == 1){
            l = my[0];
        }
    }

    public void run(){
        // System.out.println(thrd.getName() + " starting.");
        if(thrd.getName().equals("Tick")){
            for(int i = 0; i < 5; i++){
                tt.tick();
            }
        }else{
            for(int i = 0; i < 5; i++){
                tt.tock(l);
            }
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class Test {
    public static void main(String args[]){
        System.out.println("Main thread starting.");

        MyThreat mt1 = new MyThreat("Tick");
        MyThreat mt2 = new MyThreat("Tock", mt1);

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
Tick	Tock
Tick	Tock
Tick	Tock
Tick	Tock
Tick	Tock
Tick terminating.

*/
