class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	void range(){
		if(fuelcap == 8) return;
		System.out.print(fuelcap*mpg);
	}
}

class Test {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		int range;
		minivan.passengers = 4;
		minivan.fuelcap = 8;
		minivan.mpg = 10;
		System.out.print(minivan.fuelcap+"\t"+minivan.mpg+"\tis\t");
		minivan.range();
	}
}

output:

8	10	is	
