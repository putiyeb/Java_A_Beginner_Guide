class sub {
	public static int a = 7;
	public static int b = 6;
}

class Test extends sub {
	public static void main(String args[]){
		System.out.println(a+"\t"+b);
	}
}


output:

7	6

	
class sub {
	private static int a = 7;
	private static int b = 6;
	public static int getA(){
		return a;
	}
	public static int getB(){
		return b;
	}
}

class Test extends sub {
	public static void main(String args[]){
		System.out.println(getA()+"\t"+getB());
	}
}


output:

7	6
