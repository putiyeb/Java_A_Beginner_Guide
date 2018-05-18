class Sort {
	void show(int array[],int l) {
		System.out.println("The array is: ");
		for(int i=0;i<l;i++){
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	}

	void sort(int array[],int l){
		for(int a=0;a<l;a++){
			for(int b=1;b<l-a;b++){
				if(array[b]<array[b-1]){
					int t = array[b-1];
					array[b-1] = array[b];
					array[b] = t;
				}
			}
		}
	}
}

class Test {
	public static void main(String args[]) {
		int b[] = {1,23,45,34,56,3,6,2,4,67};
		Sort a = new Sort();
		a.show(b,10);
		a.sort(b,10);
		a.show(b,10);
	}
}


output:

The array is: 
1	23	45	34	56	3	6	2	4	67	
The array is: 
1	2	3	4	6	23	34	45	56	67	
