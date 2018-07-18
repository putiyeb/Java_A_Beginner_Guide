class Test{
    public static void main(String args[]){
        System.out.println(Thread.currentThread());
    }
}

/*
Thread[main,5,main]
*/


class Test{
    public static void main(String args[]){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        
    }
}


/*
main
5

*/


class Test{
    public static void main(String args[]){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setName("haha");
        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}


/*
main
5
haha
6

*/


