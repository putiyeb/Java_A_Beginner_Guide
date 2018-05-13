class Test {
	// test jaca
	public static void main(String args[]) throws java.io.IOException {
		System.out.println("Please enter something:");
		for(int i=0;;){
			if((char)System.in.read()==' ') i++;
			if((char)System.in.read()=='\n') {
				System.out.println("Total numbers of spaces: "+i);
				break;
			}
		}
	}
}

output:

$ java Test
Please enter something:
sdfafnj dfnsndjfnwdnf nwefn nwe n wn fnwnf wenfjn wnefn we ejk f

Total numbers of spaces: 4

$ java Test
Please enter something:
dsfsdf

Total numbers of spaces: 0





class Test {
	// test jaca
	public static void main(String args[]) throws java.io.IOException {
		System.out.println("Please enter something:");
		for (;;) {
			char ch = (char) System.in.read();
			if(ch=='q') {
				ch = (char) System.in.read();
				if(ch=='\n') break;
			}
			for (int i = 0;;) {
				if (ch == ' ')
					i++;
				if (ch == '\n') {
					System.out.println("Total numbers of spaces: " + i);
					break;
				}
				ch = (char) System.in.read();
			}
		}
	}
}

output:

$ java Test
Please enter something:
sdfd nd fjsdfdfisdfuhwuidf  d fnnfife         ndfjnejf  
Total numbers of spaces: 16
q
qwfdsf sf ef 
Total numbers of spaces: 3
qwewfdsf 
Total numbers of spaces: 1
$
