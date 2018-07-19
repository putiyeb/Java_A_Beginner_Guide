class Test{

    enum Transport{
        CAR, AIRPLANE, TRUCK, TRAIN, BOAT
    }

    public static void main(String args[]){
        Transport tp;
        tp = Transport.CAR;

        switch(tp){
            case "CAR":
            System.out.println("CAR");
            break;
            case "TRUCK":
            System.out.println("TRUCK");
            break;
            default:
            System.out.println("Transport");
        }
    }
}


/*
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Type mismatch: cannot convert from String to Test.Transport
	Type mismatch: cannot convert from String to Test.Transport

	at Test.main(Test.java:12)


*/


class Test{

    enum Transport{
        CAR, AIRPLANE, TRUCK, TRAIN, BOAT
    }

    public static void main(String args[]){
        Transport tp;
        tp = Transport.CAR;

        switch(tp){
            case CAR:
            System.out.println("CAR");
            break;
            case TRUCK:
            System.out.println("TRUCK");
            break;
            default:
            System.out.println("Transport");
        }
    }
}


/*
CAR
*/



class Test{

    enum Transport{
        CAR, AIRPLANE, TRUCK, TRAIN, BOAT
    }

    public static void main(String args[]){
        Transport tp;
        tp = Transport.CAR;

        if(tp == Transport.CAR){
            System.out.println(Transport.CAR);
        }

        switch(tp){
            case CAR:
            System.out.println("CAR");
            break;
            case TRUCK:
            System.out.println("TRUCK");
            break;
            default:
            System.out.println("Transport");
        }
    }
}



/*
CAR
CAR

*/
