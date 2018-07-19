
enum Transport{
    CAR, AIRPLANE, TRUCK, TRAIN, BOAT
}

class Test{

    public static void main(String args[]){
        Transport tp =  Transport.valueOf("CAR");

        Transport allTransport[] = Transport.values();

        for(Transport t : allTransport){
            System.out.print(t + "\t");
        }

        System.out.println();

        System.out.println("tp" + tp);

    }
}


/*
CAR	AIRPLANE	TRUCK	TRAIN	BOAT	
tpCAR

*/



enum Transport{
    CAR(34.65), AIRPLANE(345.43), TRUCK(40.76), TRAIN(124.45), BOAT(50.34);

    private double speed;

    Transport(double sp) { speed = sp; }

    double getSpeed(){ return speed; }
}

class Test{

    public static void main(String args[]){
        Transport tp =  Transport.TRUCK;

        Transport allTransport[] = Transport.values();

        for(Transport t : allTransport){
            System.out.print(t.getSpeed() + "\t");
        }

        System.out.println();

        System.out.println("tp" + tp.getSpeed());

    }
}


/*
34.65	345.43	40.76	124.45	50.34	
tp40.76

*/



enum Transport{
    CAR(34.65), AIRPLANE(345.43), TRUCK(40.76), TRAIN(124.45), BOAT(50.34);

    private double speed;

    Transport(double sp) { speed = sp; }

    double getSpeed(){ return speed; }
}

class Test{

    public static void main(String args[]){

        for(Transport t : Transport.values()){
            System.out.print(t.getSpeed() + "\t");
        }

        System.out.println();

        System.out.println("Truck speed is " + Transport.TRUCK.getSpeed());

    }
}

/*
34.65	345.43	40.76	124.45	50.34	
Truck speed is 40.76

*/



enum Transport{
    CAR(34.65), AIRPLANE(345.43), TRUCK(40.76), TRAIN(124.45), BOAT(50.34);

    private double speed;

    Transport(double sp) { speed = sp; }

    double getSpeed(){ return speed; }
}

class Test{

    public static void main(String args[]){

        for(Transport t : Transport.values()){
            System.out.print(t.ordinal() + "\t");
        }

        System.out.println();

        System.out.println("Truck speed is " + Transport.TRUCK.ordinal());

    }
}

/*
0	1	2	3	4	
Truck speed is 2

*/



enum Transport{
    CAR(34.65), AIRPLANE(345.43), TRUCK(40.76), TRAIN(124.45), BOAT(50.34);

    private double speed;

    Transport(double sp) { speed = sp; }

    double getSpeed(){ return speed; }
}

class Test{

    public static void main(String args[]){

        Transport tp1 = Transport.CAR;
        Transport tp2 = Transport.BOAT;

        System.out.println(tp1.compareTo(tp2));

        System.out.println(tp1.compareTo(Transport.TRUCK));

        System.out.println(tp2.compareTo(tp1));

        System.out.println(tp2.compareTo(Transport.AIRPLANE));

    }
}

/*
-4
-2
4
3

*/
