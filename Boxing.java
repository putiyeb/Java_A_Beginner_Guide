class Test{
    public static void main(String args[]){
        String str = "100";
        Integer obJ = Integer.parseInt(str);
        Integer obJ2 = new Integer(300);
        Integer obJ3 = Integer.valueOf("300");
        System.out.println(obJ);
        System.out.println(obJ2);
        System.out.println(obJ3);
    }
}



/*
100
300
300

*/


class Test{
    public static void main(String args[]){
        String str = "100";
        Integer obJ1 = Integer.parseInt(str);
        Integer obJ2 = new Integer(300);
        Integer obJ3 = Integer.valueOf("300");
        System.out.println(obJ1);
        System.out.println(obJ2);
        System.out.println(obJ3);

        int i1 = obJ1.intValue();
        int i2 = obJ2.intValue();
        int i3 = obJ3.intValue();

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}


/*
100
300
300
100
300
300

*/
