class Test {
	// test jaca
	public static void main(String args[]) {
		done: for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.println("i is " + i + "\tj is " + j);
				if (j == 3)
					continue done;
			}
		}
	}
}

output:

i is 1	j is 1
i is 1	j is 2
i is 1	j is 3
i is 2	j is 1
i is 2	j is 2
i is 2	j is 3
i is 3	j is 1
i is 3	j is 2
i is 3	j is 3
i is 4	j is 1
i is 4	j is 2
i is 4	j is 3
