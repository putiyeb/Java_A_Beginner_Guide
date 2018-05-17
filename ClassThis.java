class Vehicle {

	Vehicle(int a, int b, int c){
		this.a = a+1;
		this.b = b+2;
		this.c = c+3;
		for(var=1;b>0;b--){
			var *= b;
		}
	}

	int a;
	int b;
	int c;
	int var;

	int range(){
		return a*b;
	}
}

class Test {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(4,3,10);
		int a = minivan.range();
		System.out.println(minivan.a+"\t"+minivan.b+"\tis\t"+a);
		System.out.println(minivan.var);
	}
}

output:

5	5	is	25
6
