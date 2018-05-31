class Recursion {

	public int recur(int n){
		if(n == 1){
			return 1;
		}
		else return n*recur(n-1);
	}

	public int recur2(int m){
		int j=1;
		for(int i=m;i>0;i--){
			j *= i;
		}
		return j;
	}
}


class Test {
	public static void main(String args[]) {
		Recursion a = new Recursion();
		System.out.println(a.recur(10));
		System.out.println(a.recur2(10));
	}
}

output:

3628800
3628800
