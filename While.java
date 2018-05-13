class Test {
	// test jaca
	public static void main(String args[]) {
		char ch='A';
		while(ch<='Z'){
			System.out.println(ch);
			ch++;
		}
	}
}


output:

A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z



class Test {
	// test jaca
	public static void main(String args[]) throws java.io.IOException {
		char ch,answer='H';
		do{
			System.out.print("Please enter the character:");
			ch=(char)System.in.read();
			while((char)System.in.read()!='\n') ;
			if (ch<answer){
				System.out.println("The enter is lower than anwser");
			}else if (ch>answer){
				System.out.println("The enter is higher than anwser");
			}else{
				System.out.println("Right!!");
			}
		} while(ch!=answer);
	}
}

output

$ java Test
Please enter the character:dfdgeg
The enter is higher than anwser
Please enter the character:dfgrgerg
The enter is higher than anwser
Please enter the character:Aererg
The enter is lower than anwser
Please enter the character:JIhfuihuf
The enter is higher than anwser
Please enter the character:HUHU
Right!!
