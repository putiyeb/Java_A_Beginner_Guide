class Recursion {
	public int x;
	public static int y = 9;

	public static int add(){
		return y += y;
	}
}


class Test {
	public static void main(String args[]) {
		Recursion a = new Recursion();
		Recursion b = new Recursion();
		a.x = 18;
		b.x = 20;
		System.out.println(Recursion.y+a.x);
		System.out.println(Recursion.y+b.x);
		System.out.println(Recursion.add()+a.x);
		System.out.println(Recursion.add()+b.x);

		Recursion.y = 70;
		System.out.println(Recursion.y+a.x);
		System.out.println(Recursion.y+b.x);
		System.out.println(Recursion.add()+a.x);
		System.out.println(Recursion.add()+b.x);
	}
}

output:

27
29
36
56
88
90
158
300



class Recursion {
	public int x;
	public static int y = 9;

	public int add(){
		return y += y;
	}
}


class Test {
	public static void main(String args[]) {
		Recursion a = new Recursion();
		Recursion b = new Recursion();
		a.x = 18;
		b.x = 20;
		System.out.println(Recursion.y+a.x);
		System.out.println(Recursion.y+b.x);
		System.out.println(a.add());
		System.out.println(b.add());

		Recursion.y = 70;
		System.out.println(Recursion.y+a.x);
		System.out.println(Recursion.y+b.x);
		System.out.println(a.add());
		System.out.println(b.add());
	}
}

output:

27
29
18
36
88
90
140
280



class Recursion {
	public static int y = 9;
	public int x = y + 10;

	public int add(){
		return y += y;
	}
}


class Test {
	public static void main(String args[]) {
		Recursion a = new Recursion();
		Recursion b = new Recursion();
		System.out.println(Recursion.y+a.x);
		System.out.println(Recursion.y+b.x);
		System.out.println(a.add());
		System.out.println(b.add());

		Recursion.y = 70;
		System.out.println(Recursion.y+a.x);
		System.out.println(Recursion.y+b.x);
		System.out.println(a.add());
		System.out.println(b.add());
	}
}


output:

28
28
18
36
89
89
140
280
 

class Recursion {
	public static double x;
	public static double y;

	static{
		System.out.println("Inside:");
		x = Math.sqrt(40);
		y = Math.sqrt(50);
	}

	public Recursion(String a){
		System.out.println(a);
	}
}


class Test {
	public static void main(String args[]) {
		System.out.println(Recursion.x);
		System.out.println(Recursion.y);
		Recursion i = new Recursion("OK");
	}
}

output:

Inside:
6.324555320336759
7.0710678118654755
OK

