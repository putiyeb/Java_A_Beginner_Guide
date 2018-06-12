abstract class TwoDShape {
	protected double width;
	protected double highth;
	protected double area;

	TwoDShape(double a, double b){
		width = a;
		highth = b;
	}

	public double getWidth(){
		return width;
	}
	public double getHignth(){
		return highth;
	}
	public void setWidth(double a){
		width = a;
	}
	public void setHignth(double b){
		highth = b;
	}
	abstract double area();
}

class Triangle extends TwoDShape {
	Triangle(double a, double b){
		super(a,b);
	}
	public double area(){
		System.out.println("This is Triangle:");
		return width * highth / 2;
	}
}

class Square extends TwoDShape {
	Square(double a, double b){
		super(a,b);
	}
	public double area(){
		System.out.println("This is Square:");
		return width * highth;
	}
}

class Test {
	public static void main(String args[]){
		TwoDShape a[] = new TwoDShape[2];
		a[0] = new Triangle(4,7);
		a[1] = new Square(5, 10);
		TwoDShape ARef;
		for(int i=0;i<a.length;i++){
			ARef = a[i];
			System.out.println(ARef.area());
		}
	}
}

output:

This is Triangle:
14.0
This is Square:
50.0





abstract class TwoDShape {
	protected double width;
	protected double highth;
	protected double area;

	TwoDShape(double a, double b){
		width = a;
		highth = b;
	}

	public double getWidth(){
		return width;
	}
	public double getHignth(){
		return highth;
	}
	public void setWidth(double a){
		width = a;
	}
	public void setHignth(double b){
		highth = b;
	}
	abstract double area();
}

class Triangle extends TwoDShape {
	Triangle(double a, double b){
		super(a,b);
	}
	public double area(){
		System.out.println("This is Triangle:");
		return width * highth / 2;
	}
}

class Square extends TwoDShape {
	Square(double a, double b){
		super(a,b);
	}
	public double area(){
		System.out.println("This is Square:");
		return width * highth;
	}
}

class Test {
	public static void main(String args[]){
		TwoDShape a[] = new TwoDShape[2];
		a[0] = new Triangle(4,7);
		a[1] = new Square(5, 10);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i].area());
		}
	}
}


output:

This is Triangle:
14.0
This is Square:
50.0
