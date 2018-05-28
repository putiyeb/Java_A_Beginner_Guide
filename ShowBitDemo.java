class Test {
	public static void main(String args[]) throws java.io.IOException {
		int i=0,num=0;
		int[] a = new int[100];
		char ch = (char)System.in.read();
		while(ch!='\n'){
			if(ch>'0' && ch<'9'){
				a[i] = (int)ch-48;
			}else{
				System.out.println("Please input number!");
				return;
			}
			ch = (char)System.in.read();
			i++;
		}
		for(int j=0,k = 1;j<i;){
			num += a[i-1]*k;
			k *= 10;
			i--;
		}
		System.out.println(num);

		int n=1;
		while(n<num){
			n *= 2;
		}

		for (;n>1;n /= 2){
			if((num & n) != 0) System.out.print("1");
			else System.out.print("0");
		}
		System.out.println();
	}
}

output:

$ java Test
sdgfb
Please input number!

$ java Test
3245345
3245345
0110001100001010010000

