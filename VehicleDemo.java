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
