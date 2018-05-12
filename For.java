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


class Test {
	// test jaca
	public static void main(String args[]) throws java.io.IOException {
		System.out.print("Please enter the character:");
		char ch;
		for(int a=1;(ch=(char)System.in.read())!='S';a++){
			if(ch!='\n') continue;
			System.out.println("False");
		}
		System.out.println("Right!");
	}
}

output:

$ java Test
Please enter the character:ffghfg
False
fghfghh
False
t
False
rt
False
g
False
f
False
rthrthrth
False
Sregrthrth
Right!
$ 
