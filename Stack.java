class Stack{
	private char[] ch;
	public int a=0;

	public Stack(int i){
		ch = new char[i];
	}

	public void push(char var){
		if(ch.length == a) {
			System.out.println("Full");
			return;
		}
		ch[a++] = var;
	}

	public char popup() {
		if(a == 0){
			System.out.println("Empty");
			return '0';
		}
		return ch[--a];
	}
}

class Test {
	public static void main(String args[]){
		Stack st = new Stack(3);
		char temp = 'd';
		for(int i=0;i<4;i++){
			st.push((char)(temp+i+2));
		}
		for(int i=0;i<4;i++){
			char v = st.popup();
			if(v != '0'){
				System.out.println(v);
			}
		}
	}
}

output:

Full
h
g
f
Empty
