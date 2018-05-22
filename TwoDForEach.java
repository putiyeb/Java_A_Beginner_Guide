class Test {
	public static void main(String args[]) {
		int[][] a = new int[10][8];
		for(int i=0;i<10;i++){
			for(int j=0;j<8;j++){
				a[i][j]=(i+1)*i+j*i;
				System.out.println("Input: " + ((i+1)*i+j*i));
			}
		}

		for(int x[]: a){
			for(int y: x){
				System.out.println(y);
			}
		}
	}
}


output:

Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 2
Input: 3
Input: 4
Input: 5
Input: 6
Input: 7
Input: 8
Input: 9
Input: 6
Input: 8
Input: 10
Input: 12
Input: 14
Input: 16
Input: 18
Input: 20
Input: 12
Input: 15
Input: 18
Input: 21
Input: 24
Input: 27
Input: 30
Input: 33
Input: 20
Input: 24
Input: 28
Input: 32
Input: 36
Input: 40
Input: 44
Input: 48
Input: 30
Input: 35
Input: 40
Input: 45
Input: 50
Input: 55
Input: 60
Input: 65
Input: 42
Input: 48
Input: 54
Input: 60
Input: 66
Input: 72
Input: 78
Input: 84
Input: 56
Input: 63
Input: 70
Input: 77
Input: 84
Input: 91
Input: 98
Input: 105
Input: 72
Input: 80
Input: 88
Input: 96
Input: 104
Input: 112
Input: 120
Input: 128
Input: 90
Input: 99
Input: 108
Input: 117
Input: 126
Input: 135
Input: 144
Input: 153
0
0
0
0
0
0
0
0
2
3
4
5
6
7
8
9
6
8
10
12
14
16
18
20
12
15
18
21
24
27
30
33
20
24
28
32
36
40
44
48
30
35
40
45
50
55
60
65
42
48
54
60
66
72
78
84
56
63
70
77
84
91
98
105
72
80
88
96
104
112
120
128
90
99
108
117
126
135
144
153

	
class Test {
public static void main(String args[]) {
		int[][] a = new int[10][8];
		for(int i=0;i<10;i++){
			for(int j=0;j<8;j++){
				a[i][j]=(i+1)*i+j*i;
				System.out.println("Input: " + ((i+1)*i+j*i));
			}
		}

		int[] b = a[9];

		for(int x: b){
			System.out.println(x);
		}
	}
}


output:

Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 2
Input: 3
Input: 4
Input: 5
Input: 6
Input: 7
Input: 8
Input: 9
Input: 6
Input: 8
Input: 10
Input: 12
Input: 14
Input: 16
Input: 18
Input: 20
Input: 12
Input: 15
Input: 18
Input: 21
Input: 24
Input: 27
Input: 30
Input: 33
Input: 20
Input: 24
Input: 28
Input: 32
Input: 36
Input: 40
Input: 44
Input: 48
Input: 30
Input: 35
Input: 40
Input: 45
Input: 50
Input: 55
Input: 60
Input: 65
Input: 42
Input: 48
Input: 54
Input: 60
Input: 66
Input: 72
Input: 78
Input: 84
Input: 56
Input: 63
Input: 70
Input: 77
Input: 84
Input: 91
Input: 98
Input: 105
Input: 72
Input: 80
Input: 88
Input: 96
Input: 104
Input: 112
Input: 120
Input: 128
Input: 90
Input: 99
Input: 108
Input: 117
Input: 126
Input: 135
Input: 144
Input: 153
90
99
108
117
126
135
144
153

	
	
class Test {
	public static void main(String args[]) {
		int[][] a = new int[10][8];
		for(int i=0;i<10;i++){
			for(int j=0;j<8;j++){
				a[i][j]=(i+1)*i+j*i;
				System.out.println("Input: " + ((i+1)*i+j*i));
			}
		}

		int[] b = a[9];

		for(int x: b){
			System.out.println(x);
			if(x==144) break;
		}
	}
}

output:

Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 0
Input: 2
Input: 3
Input: 4
Input: 5
Input: 6
Input: 7
Input: 8
Input: 9
Input: 6
Input: 8
Input: 10
Input: 12
Input: 14
Input: 16
Input: 18
Input: 20
Input: 12
Input: 15
Input: 18
Input: 21
Input: 24
Input: 27
Input: 30
Input: 33
Input: 20
Input: 24
Input: 28
Input: 32
Input: 36
Input: 40
Input: 44
Input: 48
Input: 30
Input: 35
Input: 40
Input: 45
Input: 50
Input: 55
Input: 60
Input: 65
Input: 42
Input: 48
Input: 54
Input: 60
Input: 66
Input: 72
Input: 78
Input: 84
Input: 56
Input: 63
Input: 70
Input: 77
Input: 84
Input: 91
Input: 98
Input: 105
Input: 72
Input: 80
Input: 88
Input: 96
Input: 104
Input: 112
Input: 120
Input: 128
Input: 90
Input: 99
Input: 108
Input: 117
Input: 126
Input: 135
Input: 144
Input: 153
90
99
108
117
126
135
144

