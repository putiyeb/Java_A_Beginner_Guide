class Fail {
	int sum = 0;;
	public Fail(int j){
		for(int i=0;i<j;i++) sum += i;
	}

	public Fail(){
		sum++;
	}
}


class Test {
	public static void main(String args[]) {
		Fail n = new Fail();
		Fail m = new Fail(6);
		System.out.println(n.sum);
		System.out.println(m.sum);
	}
}

output:

1
15
