class Test{
	private static void Varargs(int ... v){
		System.out.println("Length: "+v.length);
		for(int i=0;i<v.length;i++){
			System.out.print(v[i]+"\t");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Varargs(23,4,43,5,56,7,5,67,9,5,4,3);
		Varargs(456,5345546,5,7,56,7,674,53,45,3,45,3,45);
	}
}

output:

Length: 12
23	4	43	5	56	7	5	67	9	5	4	3	
Length: 13
456	5345546	5	7	56	7	674	53	45	3	45	3	45	
