class Vehicle {

	int a[] = new int[10];

	void range(int b){
		for(int i=0;i<10;i++){
			a[i] = b;
			b--;
			System.out.println(a[i]);
		}
	}
}

class Test {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		minivan.range(10);
	}
}

output:

10
9
8
7
6
5
4
3
2
1




class Vehicle {

	double a[] = new double[3];

	Vehicle (double i,double j,double k){
		a[0] = i;
		a[1] = j;
		a[2] = k;
	}

	double max(){
		double temp=1;
		for(int i=0;i<3;i++){
			if (a[i]>temp) temp=a[i];
		}
		return temp;
	}
}

class Test {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(23.6,45.7,234.6);
		double a=minivan.max();
		System.out.println(a);
	}
}

output:

234.6
