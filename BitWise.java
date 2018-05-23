class Test {
	public static void main(String args[]) {
		char ch= 'a';
		for(int i=0;i<26;i++){
			System.out.print(ch);
			System.out.print((char)((int)ch & 65503));
			System.out.println();
			ch++;
		}
	}
}


output:

aA
bB
cC
dD
eE
fF
gG
hH
iI
jJ
kK
lL
mM
nN
oO
pP
qQ
rR
sS
tT
uU
vV
wW
xX
yY
zZ


class Test {
	public static void main(String args[]) {
		for(int i=0;i<26;i++){
			if((i & 4)!=0)
			System.out.println("The 2nd of byte of " + i + " is on.");
		}
	}
}


output:

The 2nd of byte of 4 is on.
The 2nd of byte of 5 is on.
The 2nd of byte of 6 is on.
The 2nd of byte of 7 is on.
The 2nd of byte of 12 is on.
The 2nd of byte of 13 is on.
The 2nd of byte of 14 is on.
The 2nd of byte of 15 is on.
The 2nd of byte of 20 is on.
The 2nd of byte of 21 is on.
The 2nd of byte of 22 is on.
The 2nd of byte of 23 is on.


class Test {
	public static void main(String args[]) {
		int i,j=1,var=125;
		for(i=1;i<var;i*=2){
			j=i;
		}
		for(j*=2;j>=1;j /= 2){
			if((j & var)!=0) System.out.print("1");
			else System.out.print("0");
		}
	}
}


output:

01111101


class Test {
	public static void main(String args[]) {
		char ch= 'A';
		for(int i=0;i<26;i++){
			System.out.print(ch);
			System.out.print((char)((int)ch | 32));
			System.out.println();
			ch++;
		}
	}
}

output:

Aa
Bb
Cc
Dd
Ee
Ff
Gg
Hh
Ii
Jj
Kk
Ll
Mm
Nn
Oo
Pp
Qq
Rr
Ss
Tt
Uu
Vv
Ww
Xx
Yy
Zz


class Test {
	public static void main(String args[]) {
		char ch= 'H';
		char ch2=(char)((int)ch^8);
		char ch3=(char)((int)ch2^8);
		System.out.print(ch+"\t"+ch2+"\t"+ch3);
	}
}

output:

H	@	H


class Test {
	public static void main(String args[]) {
		String str= "Hello World!";
		String en="";
		String de="";
		int key = 55;
		for(int i=0;i<str.length();i++){
			en += (char)((int)str.charAt(i)^key); 
		}
		for(int i=0;i<str.length();i++){
			de += (char)((int)en.charAt(i)^key); 
		}
		System.out.print(en+"\n");
		System.out.print(de);
	}
}


output:

R[[X`XE[S
Hello World!


class Test {
	public static void main(String args[]) {
		int i,j=1,var2=0,var=-34;
		for(i=1;i<var | i<-var;i*=2){
			j=i;
		}

		for(j*=2;j>=1 | -j>=1;j /= 2){
			if((j & var)!=0) System.out.print("1");
			else System.out.print("0");
		}

		System.out.print("\n");

		var2 = ~var;

		System.out.println(var+"\t"+var2);

		for(i=1;i<var2 | i<-var2;i*=2){
			j=i;
		}

		for(j*=2;j>=1 | -j>=1;j /= 2){
			if((j & var2)!=0) System.out.print("1");
			else System.out.print("0");
		}
	}
}

output:

1011110
-34	33
0100001





class Show {
	void showByte(int temp){
		System.out.println(temp);
		for(int j=128;j>=1 | -j>=1;j /= 2){
			if((j & temp)!=0) System.out.print("1");
			else System.out.print("0");
		}
		System.out.println();
	}
}

class Test {

	public static void main(String args[]) {


		int var2,var3,var=-37;

		Show a = new Show();

		a.showByte(var);

		var2 = var >> 2;

		a.showByte(var2);

		var2 = var >> 3;

		a.showByte(var2);

		var3 = var << 2;

		a.showByte(var3);

		var3 = var << 3;

		a.showByte(var3);

		var2 = var >>> 2;

		a.showByte(var2);

		var2 = var >>> 3;

		a.showByte(var2);

	}
}


output:

-37
11011011
-10
11110110
-5
11111011
-148
01101100
-296
11011000
1073741814
11110110
536870907
11111011
