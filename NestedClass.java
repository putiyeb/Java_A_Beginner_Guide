class Test {
	public static void main(String args[]) {
		class Add {
			Add(int a){
				a *= a;
				System.out.println(a);
			}
		}
		for (int i=0;i<5;i++){
			Add a = new Add(i);
		}
	}
}

output:

0
1
4
9
16

class Test2 {
	int a=2;
	void add(int i){
		Add b = new Add(i);
	}
	class Add {
		Add(int i){
			a *= i;
			System.out.println(a);
		}
	}
}
class Test{
	public static void main(String args[]) {
		Test2 c = new Test2();
		for (int i=1;i<5;i++){
			c.add(i);
		}
	}
}

output:

2
4
12
48
