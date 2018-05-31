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


	class Recursion {

	public int recur(int n){
		if(n == 1){
			return 1;
		}

		System.out.println(n+"*"+(n-1));
		int j=n*recur(n-1);
		System.out.println(n+"*"+(n-1));
		return j;
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
	
10*9
9*8
8*7
7*6
6*5
5*4
4*3
3*2
2*1
2*1
3*2
4*3
5*4
6*5
7*6
8*7
9*8
10*9
3628800
3628800
