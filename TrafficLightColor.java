
enum TrafficLightColor{
    RED, GREEN, YELLOW;
}

class TrafficLightSimulator implements Runnable{

    private TrafficLightColor tlc;
    private boolean stop = false;
    private boolean changed  = false;

    TrafficLightSimulator(TrafficLightColor init){
        tlc = init;
    }

    TrafficLightSimulator(){
        tlc = TrafficLightColor.RED;
    }

    public void run(){
        while(!stop){
            try{
                switch(tlc){
                    case RED:
                    // System.out.println("RED");
                    Thread.sleep(2000);
                    break;
                    case GREEN:
                    // System.out.println("Green");
                    Thread.sleep(1000);
                    break;
                    case YELLOW:
                    // System.out.println("Yellow");
                    Thread.sleep(2000);
                    break;
                }
            }
            catch(InterruptedException exc){
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor(){
        switch(tlc){
            case RED:
            tlc = TrafficLightColor.GREEN;
            break;
            case GREEN:
            tlc = TrafficLightColor.YELLOW;
            break;
            case YELLOW:
            tlc = TrafficLightColor.RED;
            break;
        }

        changed = true;
        notify();
    }

    synchronized void waitForChange(){
        try{
            while(!changed){
                wait();
            }
            changed = false;
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }
    }

    synchronized TrafficLightColor getColor(){
        return tlc;
    }

    synchronized void cancel(){
        stop = true;
    }

}

class Test{

    public static void main(String args[]){
        TrafficLightSimulator tls = new TrafficLightSimulator();
        Thread thrd = new Thread(tls);
        thrd.start();

        for(int i = 0;i<9;i++){
            System.out.println(tls.getColor());
            tls.waitForChange();
        }

        tls.cancel();
    }
}


/*
RED
GREEN
YELLOW
RED
GREEN
YELLOW
RED
GREEN
YELLOW


*/
