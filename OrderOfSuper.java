class Fruit {
	Fruit(){
		System.out.println("This is Friut.");
	}
}

class Apple extends Fruit {
	Apple(){
		System.out.println("This is Apple.");
	}
}

class Test {
	public static void main(String args[]){
		Apple a = new Apple();
	}
}


output:

This is Friut.
This is Apple.



class Fruit {
	protected int t;
	Fruit(){
		System.out.println("This is Friut.");
	}
}

class Apple extends Fruit {
	Apple(){
		System.out.println("This is Apple.");
		t = 3;
	}
}

class Test {
	public static void main(String args[]){
		Apple a = new Apple();
		Fruit b = new Fruit();
		b = a;
		System.out.println(b.t);
	}
}

output:

This is Friut.
This is Apple.
This is Friut.
3

