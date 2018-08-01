interface NumFunc{
    int func(int i);
}

class Test{

    static int a = 10;

    public static void main(String args[]){

        int b = 10;

        NumFunc nf = (n)->{
            int c = 7;
            a += n;
            c += n;

            return a;
        };

        System.out.println(nf.func(5));

    }

}


/*
15

*/


interface NumFunc{
    int func(int i);
}

class Test{

    static int a = 10;

    public static void main(String args[]){

        int b = 10;

        NumFunc nf = (n)->{
            int c = 7;
            a += n;
            c += n;

            return c;
        };

        System.out.println(nf.func(5));

    }

}


/*
12

*/



interface NumFunc{
    int func(int i);
}

class Test{

    static int a = 10;

    public static void main(String args[]){

        int b = 10;

        NumFunc nf = (n)->{
            int c = 7;
            a += n;
            c += n;
            b += n;

            return b;
        };

        System.out.println(nf.func(5));

    }

}



/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Local variable b defined in an enclosing scope must be final or effectively final

	at Test.main(Test.java:17)

*/



interface NumFunc{
    int func(int i);
}

class Test{

    static int a = 10;

    public static void main(String args[]){

        int b = 10;

        NumFunc nf = (n)->{
            int c = 7;
            a += n;
            c += n;
            // b += n;

            return b;
        };

        System.out.println(nf.func(5));

        System.out.println(nf.func(b++));

        

    }

}


/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Local variable b defined in an enclosing scope must be final or effectively final

	at Test.main(Test.java:19)


*/


interface NumFunc{
    int func(int i);
}

class Test{

    // static int a = 10;

    public static void main(String args[]){

        int b = 10;

        NumFunc nf = (n)->{
            int c = b + n;

            return c;
        };

        System.out.println(nf.func(5));

        System.out.println(b++);

    }

}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Local variable b defined in an enclosing scope must be final or effectively final

	at Test.main(Test.java:14)

*/




interface NumFunc{
    int func(int i);
}

class Test{

    // static int a = 10;

    public static void main(String args[]){

        final int b = 10;

        NumFunc nf = (n)->{
            int c = b + n;

            return c;
        };

        System.out.println(nf.func(5));

        // System.out.println(b++);

    }

}


/*
15

*/
