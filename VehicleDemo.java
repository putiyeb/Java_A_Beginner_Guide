class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
}

class Test {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		int range;
		minivan.passengers = 4;
		minivan.fuelcap = 8;
		minivan.mpg = 10;
		range = minivan.fuelcap*minivan.mpg;
		System.out.println(minivan.fuelcap+"\t"+minivan.mpg+"\tis\t"+range);
	}
}

output:

8	10	is	80



	
class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	int range(){
		return fuelcap*mpg;
	}
}

class Test {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		minivan.passengers = 4;
		minivan.fuelcap = 8;
		minivan.mpg = 10;
		int a = minivan.range();
		System.out.print(minivan.fuelcap+"\t"+minivan.mpg+"\tis\t"+a);
	}
}

output:

8	10	is	80



class Vehicle {

	Vehicle(int a, int b, int c){
		passengers = a;
		fuelcap = b;
		mpg = c;
	}

	int passengers;
	int fuelcap;
	int mpg;

	int range(){
		return fuelcap*mpg;
	}
}

class Test {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(4,8,10);
		int a = minivan.range();
		System.out.print(minivan.fuelcap+"\t"+minivan.mpg+"\tis\t"+a);
	}
}

output:

8	10	is	80
