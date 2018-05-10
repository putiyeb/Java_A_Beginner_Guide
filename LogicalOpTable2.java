

class Test {
	public static void main(String args[]) {
		System.out.println("P\tQ\tAND\tOR\tNOT\tXOR\t&&\t||");
		boolean P = true;
		boolean Q = true;
		boolean a[]={(P),(Q),(P&Q),(P|Q),(!P),(P^Q),(P&&Q),(P||Q)};
		for(int i=0;i<8;i++){
			if(a[i]){
				System.out.print("1\t");
				}else{
				System.out.print("0\t");
			}
		}
		System.out.println();
		P = true;
		Q = false;
		boolean b[]={(P),(Q),(P&Q),(P|Q),(!P),(P^Q),(P&&Q),(P||Q)};
		for(int i=0;i<8;i++){
			if(b[i]){
				System.out.print("1\t");
				}else{
				System.out.print("0\t");
			}
		}
		System.out.println();
		P = false;
		Q = false;
		boolean c[]={(P),(Q),(P&Q),(P|Q),(!P),(P^Q),(P&&Q),(P||Q)};
		for(int i=0;i<8;i++){
			if(c[i]){
				System.out.print("1\t");
				}else{
				System.out.print("0\t");
			}
		}
		System.out.println();
		P = false;
		Q = true;
		boolean d[]={(P),(Q),(P&Q),(P|Q),(!P),(P^Q),(P&&Q),(P||Q)};
		for(int i=0;i<8;i++){
			if(d[i]){
				System.out.print("1\t");
				}else{
				System.out.print("0\t");
			}
		}
	}
}

output:

P	Q	AND	OR	NOT	XOR	&&	||
1	1	1	1	0	0	1	1	
1	0	0	1	0	1	0	1	
0	0	0	0	1	0	0	0	
0	1	0	1	1	1	0	1
