class Test {
	public static void main(String args[]) {
		int a[][] = {{1,2},{4,5}};
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println(a[i][j]);
			}
		}
	}
}

output:

1
2
4
5


class Test {
	public static void main(String args[]) {
		int a[][] = {{1,2},{4,5}};
		int[][] b = new int[2][2];

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				b[i][j]=i*5+j;
			}
		}

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(a[i][j]+"\t");
			}
		}
		System.out.println();

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(b[i][j]+"\t");
			}
		}
		System.out.println();

		a=b;
		b[1][1]=100;
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(a[i][j]+"\t");
			}
		}
	}
}


output:

1	2	4	5	
0	1	5	6	
0	1	5	100	
