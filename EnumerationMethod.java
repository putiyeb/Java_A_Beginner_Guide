
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
