class Test {
	public static void main(String args[]) {
		int a[][] = new int[3][];
		a[0] = new int[4];
		a[1] = new int[4];
		a[2] = new int[2];
		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
				System.out.println(a[i][j]=4*i+j+1);
			}
		}
		for(int i=2;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.println(a[i][j]=5*i+j+1);
			}
		}
	}
}

output:

1
2
3
4
5
6
7
8
11
12
