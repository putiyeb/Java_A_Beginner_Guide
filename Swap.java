class Stack{
	int a;
	Stack(int i) { a = i;}
	void swap(Stack var1,Stack var2){
		int temp;
		temp = var1.a;
		var1.a = var2.a;
		var2.a = temp;
	}
	void swap2(Stack var1,Stack var2){
		Stack temp;
		temp = var1;
		var1 = var2;
		var2 = temp;
	}
}

class Test {
	public static void main(String args[]){
		Stack st = new Stack(3);
		Stack st2 = new Stack(5);
		st.swap(st,st2);
		System.out.println(st.a+"\t"+st2.a);
		st.swap2(st,st2);
		System.out.println(st.a+"\t"+st2.a);
	}
}


output:

5	3
5	3
