class Queue {
		double[] a;
		int start, end;
		Queue(int size){
			a = new double[size];
			start = 0;
			end = 0;
		}

		void put(double x){
			if(end == a.length){
				System.out.println(" - Queue is full.");
				return;
			}
			a[end++] = x;
		}

		double get(){
			if(start==end){
				System.out.println(" - Queue is empty.");
				return 0;
			}
			return a[start++];
		}
}

class Test {
	public static void main(String args[]) {
		Queue a = new Queue(10);
		for(int i=0;i<10;i++){
			a.put((i+1)*i);
			System.out.println("Input: " + (i+1)*i);
		}
		System.out.print("Has Input: 1000");
		a.put(1000);

		for(int i=0;i<10;i++){
			System.out.println(a.get());
		}

		a.get();
		System.out.println(a.start + "\t" + a.end);
	}
}

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
Has Input: 1000 - Queue is full.
0.0
2.0
6.0
12.0
20.0
30.0
42.0
56.0
72.0
90.0
 - Queue is empty.
10	10
