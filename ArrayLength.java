class Test {
	public static void main(String args[]) {
		int[][] a = {{234,67,234,456},{45,235,54546,567,567,345}};
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		for(int i=0;i<a[0].length;i++){
			System.out.print((a[0][i]=i+10) + "\t");
		}
		System.out.println();
		for(int i=0;i<a[1].length;i++){
			System.out.print((a[1][i]=i+20) + "\t");
		}
	}
}

output:

2
4
6
10	11	12	13	
20	21	22	23	24	25	
