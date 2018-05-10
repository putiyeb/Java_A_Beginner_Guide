
class Test {
	// test jaca
	public static void main(String args[]) {
		byte a = 2000;
		byte b;
		b = (byte)(a * a);
		System.out.println(b);
	}
}

output:

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from int to byte
	at Test.main(Test.java:10)
  
  
class Test {
	// test jaca
	public static void main(String args[]) {
		byte a = 20;
		byte b;
		b = (byte)(a * a);
		System.out.println(b);
	}
}

output:
-112


class Test {
	// test jaca
	public static void main(String args[]) {
		byte a = 10;
		byte b;
		b = (byte)(a * a);
		System.out.println(b);
	}
}

output:

100

class Test {
	// test jaca
	public static void main(String args[]) {
		byte a = 10;
		byte b;
		b = (a * a);
		System.out.println(b);
	}
}

output:

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from int to byte
	at Test.main(Test.java:12)
