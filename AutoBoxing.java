class Test{
    public static void main(String args[]){
        Integer obJ = "100";
        int i = obJ;

        System.out.println(obJ + "" + i);
    }
}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from String to Integer

	at Test.main(Test.java:3)


*/


class Test{
    public static void main(String args[]){
        Integer obJ = 100;
        int i = obJ;

        System.out.println(obJ + "" + i);
    }
}



/*
100100

*/


class Test{

    public static int m1(Integer obJ){
        return obJ;
    }

    public static Integer m2(){
        return 100;
    }

    public static void main(String args[]){
        Integer obJ = 200;
        System.out.println(m1(obJ));

        int i = m2();
        System.out.println(i);
    }
}

/*
200
100

*/



class Test{

    public static int m1(Integer obJ){
        return obJ;
    }

    public static Integer m2(){
        return 100;
    }

    public static void main(String args[]){
        Integer obJ = 200;
        System.out.println(m1(obJ));

        System.out.println(m2());
        System.out.println(Math.sqrt(m2()));
    }
}

/*
200
100
10.0

*/


class Test{

    public static void main(String args[]){
        Integer obJ = 200;
        System.out.println(++obJ);

        System.out.println(obJ *= 2);

        System.out.println(Math.sqrt(obJ));
    }
}


/*
201
402
20.049937655763422

*/
