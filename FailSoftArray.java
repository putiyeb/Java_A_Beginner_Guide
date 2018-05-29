class Fail {
	private int a[];
	public int b;
	public int length;

	public Fail(int len, int error){
		length = len;
		b = error;
		a = new int[len];
	}

	boolean checkIndex(int index){
		if(index >= 0 && index < length) return true;
		else return false;
	}

	public int put(int i,int val){
		if(checkIndex(i)) {
			a[i] = val;
			return 0;
		}
		else return b;
	}

	public int get(int j){
		if(checkIndex(j)) return a[j];
		else return b;
	}

}

class Test {
	public static void main(String args[]) {
		Fail test = new Fail(5,-1);

		for(int i=0;i<=test.length*2;i++){
			test.put(i,i*10);
		}

		for(int i=0;i<=test.length*2;i++){
			if(test.get(i) != test.b) System.out.println(test.get(i));
		}
		// System.out.println(test.b);

		for(int i=0;i<=test.length*2;i++){
			if(test.put(i,i*10) == test.b) System.out.println("a["+i+"] out of bound!");
		}

		for(int i=0;i<=test.length*2;i++){
			if(test.get(i) != test.b) System.out.println(test.get(i));
			else System.out.println("a["+i+"] out of bound!");
		}
	}
}

output:

0
10
20
30
40
a[5] out of bound!
a[6] out of bound!
a[7] out of bound!
a[8] out of bound!
a[9] out of bound!
a[10] out of bound!
0
10
20
30
40
a[5] out of bound!
a[6] out of bound!
a[7] out of bound!
a[8] out of bound!
a[9] out of bound!
a[10] out of bound!

	
	
	
class Fail {
	private int a[];
	public int b;
	public int length;
	public int c = 0, d = 0;

	public Fail(int len, int error){
		length = len;
		b = error;
		a = new int[len];
	}

	boolean checkIndex(int index){
		if(index >= 0 && index < length) return true;
		else return false;
	}

	public int put(int val){
		if(checkIndex(c)) {
			a[c] = val;
			c++;
			return 0;
		}
		else return b;
	}

	public int get(){
		if(checkIndex(d)) {
			if(c == d && c!=0){
				d = c = 0;
				System.out.println("The queue is empty!");
				return b;
			}
			int temp = a[d];
			d++;
			return temp;
		}
		else return b;
	}

}

class Test {
	public static void main(String args[]) {
		Fail test = new Fail(5,-1);

		for(int i=0;i<=test.length*2;i++){
			test.put(i*10);
		}

		for(int i=0;i<=test.length*2;i++){
			int temp = test.get();
			if(temp != test.b) System.out.println(temp);
		}
		System.out.println(test.c);
		System.out.println(test.d);

		// System.out.println(test.b);

		for(int i=0;i<=test.length*2;i++){
			if(test.put(i*10) == test.b) System.out.println("a["+i+"] out of bound!");
		}

		for(int i=0;i<=test.length*2;i++){
			int temp = test.get();
			if(temp != test.b) System.out.println(temp);
			else System.out.println("a["+i+"] out of bound!");
		}
	}
}

output:

0
10
20
30
40
5
5
a[0] out of bound!
a[1] out of bound!
a[2] out of bound!
a[3] out of bound!
a[4] out of bound!
a[5] out of bound!
a[6] out of bound!
a[7] out of bound!
a[8] out of bound!
a[9] out of bound!
a[10] out of bound!
a[0] out of bound!
a[1] out of bound!
a[2] out of bound!
a[3] out of bound!
a[4] out of bound!
a[5] out of bound!
a[6] out of bound!
a[7] out of bound!
a[8] out of bound!
a[9] out of bound!
a[10] out of bound!
