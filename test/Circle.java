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

public class Circle extends TwoDShape{
	public Circle(double a, double b){
		super(a,b);
	}
	public double area(){
		return 3.14*width*highth;
	}
}
