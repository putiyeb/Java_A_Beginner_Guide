class Test {
	// test jaca
	public static void main(String args[]) throws java.io.IOException {
		for(;;){
			System.out.println("Enter the number");
			if (System.in.read()=='q') {
				System.out.println("Right!"); break;
			}
			while(System.in.read()!='\n');
		}
	}
}


output

$ java Test
Enter the number
dsfsdf
Enter the number
dgth
Enter the number
wefdfq
Enter the number
dfgdfg
Enter the number
qrgg
Right!


class Test {
	// test jaca
	public static void main(String args[]) {
		for (int i = 1; i < 4; i++) {
			System.out.println(i);
			one: {
				two: {
					three: {
						if (i == 1)
							break one;
						if (i == 2)
							break two;
						if (i == 3)
							break three;
						System.out.println("three");
					}
					System.out.println("two");
				}
				System.out.println("one");
			}
			System.out.println();
		}
		System.out.println("after for");
	}
}

output:

1

2
one

3
two
one

after for




class Test {
	// test jaca
	public static void main(String args[]) {
		done: for (int j = 1; j < 5; j++) {
			for (int i = 1; i < 5; i++) {
				System.out.println(i);
				one: {
					two: {
						three: {
							if (i == 1)
								break one;
							if (i == 2)
								break two;
							if (i == 3)
								break three;
							break done;
						}
						System.out.println("two");
					}
					System.out.println("one");
				}
				System.out.println();
			}
			System.out.println("after for");
		}
	}
}

output:

1

2
one

3
two
one

4


class Test {
	// test jaca
	public static void main(String args[]) {
		for (int j = 1; j < 5; j++) 
		done:{
			for (int i = 1; i < 5; i++) {
				one: {
					two: {
						three: {
							System.out.println("j is "+j+"\t"+"i is "+i);
							if (i == 1)
								break one;
							if (i == 2)
								break two;
							if (i == 3)
								break three;
							break done;
						}
						System.out.print("two\t");
					}
					System.out.print("one\t\n");
				}
			}
		}
	}
}

output:

j is 1	i is 1
j is 1	i is 2
one	
j is 1	i is 3
two	one	
j is 1	i is 4
j is 2	i is 1
j is 2	i is 2
one	
j is 2	i is 3
two	one	
j is 2	i is 4
j is 3	i is 1
j is 3	i is 2
one	
j is 3	i is 3
two	one	
j is 3	i is 4
j is 4	i is 1
j is 4	i is 2
one	
j is 4	i is 3
two	one	
j is 4	i is 4
