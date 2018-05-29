class Fail {
	public int a,b,c,total;

	public Fail(int i,int j,int k){
		a = i;
		b = j;
		c = k;
		total = a+b+c;
	}

	void Single(Fail Comp1){
		if(Comp1.a == a) System.out.println("Same.");
		else System.out.println();
	}

	void Total(Fail Comp1){
		if(Comp1.total == total) System.out.println("Same.");
		else System.out.println();
	}
}

class Test {
	public static void main(String args[]) {
		Fail test = new Fail(5,546,567);
		Fail test2 = new Fail(546,565,7);
		Fail test3 = new Fail(5,546,567);

		System.out.print("test svs test2 ");
		test.Single(test2);
		System.out.print("test svs test3 ");
		test.Single(test3);
		System.out.print("test tvs test2 ");
		test.Total(test3);
		System.out.print("test tvs test2 ");
		test.Total(test3);
	}
}

output:

test svs test2 
test svs test3 Same.
test tvs test2 Same.
test tvs test2 Same.

