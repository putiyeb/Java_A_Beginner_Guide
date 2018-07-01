class QueueFullException extends Exception{
    public String toString(){
        return "Queue full";
    }
}

class QueueEmptyException extends Exception{
    public String toString(){
        return "Queue empty";
    }
}

class FixedQueue{
    private int[] q;
    private int putloc, getloc;

    public FixedQueue(int size){
        q = new int[size];
        putloc = getloc = 0;
    }

    public void putloc(int ch) throws QueueFullException{
        if(putloc == q.length){
            throw new QueueFullException();
        }

        q[putloc++] = ch;

        return;
    }

    public int getloc() throws QueueEmptyException{
        if (getloc == putloc){
            throw new QueueEmptyException();
        }

        return q[getloc++];
    }
}

class Test{
    public static void main(String args[]){
        int[] i = {24,23,45,78677,56,54,34,5};

        FixedQueue queue = new FixedQueue(4);
        for(int j = 0; j<2; j++){
            try{
            queue.putloc(i[j]);
            System.out.println("The input value is: " + i[j]);
            }
            catch(QueueFullException exc){
                System.out.println(exc);
            }
        }

        for(int k = 0; k<4; k++){
            try{
            System.out.println("The output value is: " + queue.getloc());
            }
            catch(QueueEmptyException exc){
                System.out.println(exc);
            }
        }

        for(int l = 0; l<3; l++){
            try{
            queue.putloc(l);
            System.out.println("The input value is: " + l);
            }
            catch(QueueFullException exc){
                System.out.println(exc);
            }
        }

        for(int m = 0; m<4; m++){
            try{
            System.out.println("The output value is: " + queue.getloc());
            }
            catch(QueueEmptyException exc){
                System.out.println(exc);
            }
        }
    }
}


/*
$ java Test
The input value is: 24
The input value is: 23
The output value is: 24
The output value is: 23
Queue empty
Queue empty
The input value is: 0
The input value is: 1
Queue full
The output value is: 0
The output value is: 1
Queue empty
Queue empty
*/
