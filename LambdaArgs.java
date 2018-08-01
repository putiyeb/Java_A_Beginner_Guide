interface StringFunc{
    String func(String str);
}



class Test{

    // String changeStr(StringFunc sf, String str){
    //     String str1 = "";
    //     sf = (str)->{
    //         for(int i = str.length() - 1; i>= 0; i--){
    //             str1 = str1 + str.charAt(i);
    //         }
    //         return str1;
    //     };

    //     sf = 

    // }

    public static void main(String args[]){
        StringFunc sf;
        String inStr = "Xiao XiuZi";
        String outStr;
        sf = (str)->{
            String str1 = ""; 
            for(int i = str.length() - 1; i>= 0; i--){
                str1 = str1 + str.charAt(i);
            }
            return str1;
        };

        System.out.println(sf.func(inStr));

        sf = (str)->{
            String str1 = ""; 
            for(int i = str.length() - 1; i>= 0; i--){
                if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                    str1 += (char)(str.charAt(i)+32);
                    continue;
                }
                str1 += str.charAt(i);
            }
            return str1;
        };

        System.out.println(sf.func(inStr));


        sf = (str)->{
            String str1 = ""; 
            for(int i = str.length() - 1; i>= 0; i--){
                if(str.charAt(i) == ' '){
                    str1 += '-';
                    continue;
                }
                str1 += str.charAt(i);
            }
            return str1;
        };

        System.out.println(sf.func(inStr));
    }

}




/*
iZuiX oaiX
izuix oaix
iZuiX-oaiX

*/


interface StringFunc{
    String func(String str);
}



class Test{

    static String changeStr(StringFunc sf, String str){
        return sf.func(str);
    }

    public static void main(String args[]){
        StringFunc sf;
        String inStr = "Xiao XiuZi";
        String outStr;
        sf = (str)->{
            String str1 = ""; 
            for(int i = str.length() - 1; i>= 0; i--){
                str1 = str1 + str.charAt(i);
            }
            return str1;
        };

        System.out.println(changeStr(sf, inStr));



        System.out.println(changeStr(
            (str)->{
                String str1 = "";
                for(int i = 0; i < str.length(); i++)
                str1 += Character.isUpperCase(str.charAt(i)) ? Character.toLowerCase(str.charAt(i)) : Character.toUpperCase(str.charAt(i));
                return str1;
            }
            , inStr));


        System.out.println(changeStr((str)->str.replace(' ', '-'), inStr));
    }

}


/*
iZuiX oaiX
xIAO xIUzI
Xiao-XiuZi

*/
