class Test{

    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y){
        if(x.length != y.length) return false;

        for(int i = 0; i<x.length; i++){
            if(x[i] != y[i]) return false;
        }

        return true;
    }

    public static void main(String args[]){
        Integer[] a = {23,76,76,86,6};
        Integer[] b = {23,76,76,86,6};

        if(arraysEqual(a,b)){
            System.out.println("ok");
        }else{
            System.out.println("bad");
        }
    }
}


/*
ok

*/



class Test{

    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y){
        if(x.length != y.length) return false;

        for(int i = 0; i<x.length; i++){
            if(x[i] != y[i]) return false;
        }

        return true;
    }

    public static void main(String args[]){
        Integer[] a = {23,76,76,86,6};
        Short[] b = {23,76,76,86,6};

        if(arraysEqual(a,b)){
            System.out.println("ok");
        }else{
            System.out.println("bad");
        }
    }
}


/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method arraysEqual(T[], V[]) in the type Test is not applicable for the arguments (Integer[], Short[])

	at Test.main(Test.java:17)

*/




class Test{

    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y){
        if(x.length != y.length) return false;

        for(int i = 0; i<x.length; i++){
            if(x[i] != y[i]) return false;
        }

        return true;
    }

    public static void main(String args[]){
        int[] a = {23,76,76,86,6};
        int[] b = {23,76,76,86,6};

        if(arraysEqual(a,b)){
            System.out.println("ok");
        }else{
            System.out.println("bad");
        }
    }
}



/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method arraysEqual(T[], V[]) in the type Test is not applicable for the arguments (int[], int[])

	at Test.main(Test.java:17)


*/


class Test{

    static <T extends Comparable, V extends T> boolean arraysEqual(T[] x, V[] y){
        if(x.length != y.length) return false;

        for(int i = 0; i<x.length; i++){
            if(x[i] != y[i]) return false;
        }

        return true;
    }

    public static void main(String args[]){
        Short[] a = {23,76,76,86,6};
        Integer[] b = {23,76,76,86,6};

        if(arraysEqual(a,b)){
            System.out.println("ok");
        }else{
            System.out.println("bad");
        }
    }
}



/*
bad
*/


class Test{

    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y){
        if(x.length != y.length) return false;

        for(int i = 0; i<x.length; i++){
            if(x[i] != y[i]) return false;
        }

        return true;
    }

    public static void main(String args[]){
        Double[] a = {23.45d,76d,76d,86d,6d};
        Double[] b = {23.45d,76d,76d,86d,6d};

        if(arraysEqual(a,b)){
            System.out.println("ok");
        }else{
            System.out.println("bad");
        }
    }
}


/*
bad

*/
