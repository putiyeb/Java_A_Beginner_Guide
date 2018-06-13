package test;

abstract class TwoDShape {
	public double width;
	public double highth;
	TwoDShape(double a, double b){
		width = a;
		highth = b;
	}
	abstract public double area();
}

class Circle extends TwoDShape{
	Circle(double a, double b){
		super(a,b);
	}
	public double area(){
		return 3.14*width*highth;
	}
}

class Test {
	public static void main(String args[]){
		Circle c = new Circle(5,5);
		System.out.println(c.area());
	}
}


mkdir test
mv Test.java ./test/
javac test/Test.java
java java --class-path ~/Desktop test.Test

output:

78.5
