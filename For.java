class Test {
	// test jaca
	public static void main(String args[]) throws java.io.IOException {
		System.out.print("Please enter the character:");
		for(int a=1;(char)System.in.read()!='S';a++){
			System.out.println("False");
		}
		System.out.println("Right!");
	}
}

output:

$ java Test
Please enter the character:v
False
False
S
Right!
$ 

?? why does the "False" print out twice 
