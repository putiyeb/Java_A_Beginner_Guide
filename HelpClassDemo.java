class Help {
	void showMenu(){
		System.out.println("1 if");
		System.out.println("2 for");
		System.out.println("3 do...while");
		System.out.println("4 while");
		System.out.println("5 swith");
		System.out.println("6 break");
		System.out.println("7 continue");
		System.out.println("q exit");
	}
	void showHelp(char ch){
		switch(ch){
			case '1':
			System.out.println("if");
			break;
			case '2':
			System.out.println("for");
			break;
			case '3':
			System.out.println("do...while");
			break;
			case '4':
			System.out.println("while");
			break;
			case '5':
			System.out.println("swith");
			break;
			case '6':
			System.out.println("break");
			break;
			case '7':
			System.out.println("continue");
			break;
		}
	}

	boolean checkInput(char ch) {
		if (ch < '1' || ch > '7' && ch != 'q') return true;
		else return false;
	}
}

class Test {
	// test jaca
	public static void main(String args[]) throws java.io.IOException {
		for(;;){
			char ch;
			Help a = new Help();
			do{
				a.showMenu();
				ch=(char)System.in.read();
				while((char)System.in.read()!='\n') ;
				System.out.println();
			}while(a.checkInput(ch));
			if(ch=='q') break;
			a.showHelp(ch);
			System.out.println();
		}
	}
}

output:

$ java Test
1 if
2 for
3 do...while
4 while
5 swith
6 break
7 continue
q exit
3

do...while

1 if
2 for
3 do...while
4 while
5 swith
6 break
7 continue
q exit
7

continue

1 if
2 for
3 do...while
4 while
5 swith
6 break
7 continue
q exit
q

