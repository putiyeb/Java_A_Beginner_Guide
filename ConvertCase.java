class Test {
	public static void main(String args[]) throws java.io.IOException {
		char ch;
		int i=0;
		System.out.println("Please Enter the string: ");
		do{
			ch = (char)System.in.read();
			if(ch<'Z' && ch>'A'){
				ch+=32;
				System.out.print(ch);
				i++;
			}else if(ch>'a' && ch<'z'){
				ch-=32;
				System.out.print(ch);
				i++;
			}
		}while(ch!='\n');
		System.out.println("\nTotal "+i);
	}
}

output:

$ java Test
Please Enter the string: 
sdfsdfFEFEF
SDFSDFfefef
Total 11
