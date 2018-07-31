interface StringTest{
    boolean test(String str1, String str2);
}

class Test{

    public static void main(String args[]){
        String a = "cai shuixiu";
        String b = "xi";
        String c = "xio";
    
        StringTest strT;
    
        strT = (str1,str2)-> str1.indexOf(str2) != -1;
    
        System.out.println(strT.test(a,b));
        System.out.println(strT.test(a,c));

    }

}


/*
true
false

*/
