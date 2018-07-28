class QueueFullException extends Exception {
    int size;

    QueueFullException(int s){
        size = s;
    }

    public String toString(){
        return "\nQueue is full. Maximum size is " + size;
    }
}

class QueueEmptyException extends Exception {
    public String toString(){
        return "\nQueue is empty.";
    }
}



interface IGenQ<T>{
    public void put(T O) throws QueueFullException;
    public T get() throws QueueEmptyException;
}

class GenQueue<T> implements IGenQ<T>{
    private T[] q;
    private int putloc, getloc;

    GenQueue(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }

    public void put(T o) throws QueueFullException{
        if(putloc == q.length) throw new QueueFullException(putloc);
        q[putloc++] = o;
    }

    public T get() throws QueueEmptyException{
        if(getloc == putloc) throw new QueueEmptyException();
        return q[getloc++];
    }
}

class Test{
    public static void main(String args[]){
        GenQueue<Double> gq = new GenQueue<Double>(new Double[5]);

        double d = 5.67;

        try{
            for(double i=0;i<10;i++){
                gq.put(d+i);
            }
        }
        catch(QueueFullException exc){
            System.out.println(exc);
        }

        try{
            for(int i=0;i<10;i++){
                System.out.println(gq.get());
            }
        }
        catch(QueueEmptyException exc){
            System.out.println(exc);
        }

    }
}


/*
Queue is full. Maximum size is 5
5.67
6.67
7.67
8.67
9.67

Queue is empty.

*/



public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s){
        size = s;
    }

    public String toString(){
        return "\nQueue is full. Maximum size is " + size;
    }
}

public class QueueEmptyException extends Exception {
    public String toString(){
        return "\nQueue is empty.";
    }
}



interface IGenQ<T>{
    public void put(T O) throws QueueFullException;
    public T get() throws QueueEmptyException;
}

class GenQueue<T> implements IGenQ<T>{
    private T[] q;
    private int putloc, getloc;

    GenQueue(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }

    public void put(T o) throws QueueFullException{
        if(putloc == q.length) throw new QueueFullException(putloc);
        q[putloc++] = o;
    }

    public T get() throws QueueEmptyException{
        if(getloc == putloc) throw new QueueEmptyException();
        return q[getloc++];
    }
}

class Test{
    public static void main(String args[]){
        GenQueue<Double> gq = new GenQueue<Double>(new Double[5]);

        double d = 5.67;

        try{
            for(double i=0;i<10;i++){
                gq.put(d+i);
            }
        }
        catch(QueueFullException exc){
            System.out.println(exc);
        }

        try{
            for(int i=0;i<10;i++){
                System.out.println(gq.get());
            }
        }
        catch(QueueEmptyException exc){
            System.out.println(exc);
        }

    }
}


/*
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The public type QueueFullException must be defined in its own file
	The public type QueueEmptyException must be defined in its own file

	at QueueFullException.<init>(Test.java:1)
	at GenQueue.put(Test.java:36)
	at Test.main(Test.java:54)

*/




class QueueFullException extends Exception {
    int size;

    QueueFullException(int s){
        size = s;
    }

    public String toString(){
        return "\nQueue is full. Maximum size is " + size;
    }
}

class QueueEmptyException extends Exception {
    public String toString(){
        return "\nQueue is empty.";
    }
}



interface IGenQ<T>{
    public void put(T O) throws QueueFullException;
    public T get() throws QueueEmptyException;
}

class GenQueue<T> implements IGenQ<T>{
    private T[] q;
    private int putloc, getloc;

    GenQueue(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }

    public void put(T o) throws QueueFullException{
        if(putloc == q.length) throw new QueueFullException(putloc);
        q[putloc++] = o;
    }

    public T get() throws QueueEmptyException{
        if(getloc == putloc) throw new QueueEmptyException();
        return q[getloc++];
    }
}

class Test{
    public static void main(String args[]){
        GenQueue<Double> gq = new GenQueue<Double>(new Double[5]);

        double d = 5.67;

        try{
            for(double i=0;i<10;i++){
                gq.put(d+i);
            }
        }
        catch(QueueFullException exc){
            System.out.println(exc);
        }

        try{
            for(int i=0;i<10;i++){
                System.out.println(gq.get());
            }
        }
        catch(QueueEmptyException exc){
            System.out.println(exc);
        }

        GenQueue<Integer> gq2 = new GenQueue<Integer>(new Integer[5]);

        try{
            for(int i=0;i<10;i++){
                gq2.put(i);
            }
        }
        catch(QueueFullException exc){
            System.out.println(exc);
        }

        try{
            for(int i=0;i<10;i++){
                System.out.println(gq2.get());
            }
        }
        catch(QueueEmptyException exc){
            System.out.println(exc);
        }

    }
}




/*
Queue is full. Maximum size is 5
5.67
6.67
7.67
8.67
9.67

Queue is empty.

Queue is full. Maximum size is 5
0
1
2
3
4

Queue is empty.


*/
