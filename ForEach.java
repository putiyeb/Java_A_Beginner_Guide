class Test {
	public static void main(String args[]) {
		int[] a = new int[10];
		for(int i=0;i<10;i++){
			a[i]=(i+1)*i;
			System.out.println("Input: " + (i+1)*i);
		}

		for(int x: a){
			System.out.println(x);
		}

	}
}



output:

Input: 0
Input: 2
Input: 6
Input: 12
Input: 20
Input: 30
Input: 42
Input: 56
Input: 72
Input: 90
0
2
6
12
20
30
42
56
72
90
