class Sum{

    int sum = 0;

    <T extends Number> Sum(T ob){
        for(int i = 0; i <= ob.intValue(); i++){
            sum += i;
        }
    }

    int getSum(){
        return sum;
    }
}

class Test{

    public static void main(String args[]){
        Sum summation = new Sum(4.5);
        System.out.println(summation.getSum());
    }
}
