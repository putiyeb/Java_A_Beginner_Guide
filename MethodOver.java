class Fail {
	public void demo(){
		System.out.println("demo1");
	}

	public void demo(int i){
		System.out.println(i);
	}

	public int demo(int i, int j){
		return i+j;
	}

	public double demo(double i){
		return i;
	}
}


class Test {
	public static void main(String args[]) {
		Fail n = new Fail();
		n.demo();
		n.demo(5);
		System.out.println(n.demo(6,12));
		System.out.println(n.demo(5.6));
	}
}

output:

demo1
5
18
5.6
 


class Fail {
	public void demo(){
		System.out.println("demo1");
	}

	public void demo(int i){
		System.out.println(i);
	}

	public int demo(int i, int j){
		return i+j;
	}

	public double demo(double i){
		return i;
	}
}


class Test {
	public static void main(String args[]) {
		Fail n = new Fail();
		byte a = 10;
		float b = 1.34F;
		n.demo();
		n.demo(a);
		System.out.println(n.demo(6,12));
		System.out.println(n.demo(b));
	}
}

output:

demo1
10
18
1.340000033378601
