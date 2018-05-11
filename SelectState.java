class Test {
	// test jaca
	public static void main(String args[]) throws java.io.IOException {
			int a;
			System.out.println("1 if ");
			System.out.println("2 switch ");
			System.out.print("The input character: ");
			a = (int) System.in.read();
			System.out.println(a);
			if (a == 1) System.out.println("if");
			else if(a == 2){
				System.out.println("switch");
			}
	}
}


output:

1 if 
2 switch 
The input character: 1
49




class Test {
	// test jaca
	public static void main(String args[]) throws java.io.IOException {
			int a;
			System.out.println("1 if ");
			System.out.println("2 switch ");
			System.out.print("The input character: ");
			a = (char) System.in.read();
			System.out.println(a);
			if (a == '1') System.out.println("if");
			else if(a == '2'){
				System.out.println("switch");
			}
	}
}

output:

1 if 
2 switch 
The input character: 2
50
switch
