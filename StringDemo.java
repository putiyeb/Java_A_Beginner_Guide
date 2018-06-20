class Test {
	public static void main(String args[]) {
		String str = new String("Hello");
		String str2 = " world";
		System.out.print(str+str2);
	}
}

output:

Hello world


class Test {
	public static void main(String args[]) {
		String str = new String("Hello");
		String str2 = " world";
		String str3[] = {str,str2};
		for (String a: str3){
			System.out.print(a+"\t");
		}
		System.out.println();
		System.out.println(str.length());
		char ch = 'r';
		System.out.println(str2.charAt(5));


		System.out.println(str.equals(str2));


		System.out.println(str.compareTo(str2));
		System.out.println(str.indexOf("l"));
		System.out.println(str.lastIndexOf("l"));
	}
}


output:

Hello	 world	
5
d
false
40
2
3


class Test {
	public static void main(String args[]) {
		String str = new String("Hello World");
		String str2 = str.substring(6,11);
		System.out.println(str2);
		System.out.println(str);
	}
}



output:

World
Hello World


class Test {
	public static void main(String args[]) {
		String str = new String("World");
		switch(str){
			case "Hello":
			System.out.print("Hello");
			break;
			case "World":
			System.out.print("World");
			break;
			default:
			System.out.print("none");
		}
	}
}

output:

World

class Test {
	public static void main(String args[]) {
		for(String x: args){
			System.out.println(x);
		}
	}
}

output:

$ java Test sdnfj sdjnfjkw enfjwef nwn nwe f
sdnfj
sdjnfjkw
enfjwef
nwn
nwe
f



class Test {
	public static void main(String args[]) {
		String[][] a = {
			{"John","123456"},
			{"Mike","654321"}
		};
		if(args.length!=1){
			System.out.println("Only with one arguement, like java Test xxx");
		}else{
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					if(args[0].equals(a[i][j])){
						for(String x:a[i]) System.out.println(x);
					}
				}
			}
		}
	}
}

output:

$ java Test 123456
John
123456

$ java Test John
John
123456

$ java Test sdnfjnj

$ java Test
Only with one arguement, like java Test xxx

$ 
