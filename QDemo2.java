class Queue {
	public int i=0,j=0,a[];

	public Queue(){
		a = new int[6];
	}
	
	public Queue(int b[]){
		a = b;
		j = b.length;
	}

	public Queue(Queue c){
		a = new int[c.a.length];
		for(int i=0;i<c.a.length;i++)
		{
			a[i] = c.a[i];
		}
		j = a.length;
	}

	public int get(){
		if(j != 0 && i != j){
			return a[i++];
		}else{
			i = 0;
			j = 0;
			return -1;
		}
	}

	public void put(int temp){
		if(j < a.length){
			a[j++] = temp;
		}
		else System.out.println("The Queue is full.");
	}
}


class Test {
	public static void main(String args[]) {
		int[] d = {1,4,6,8,34,8,3524,4};
		Queue n = new Queue(d);
		Queue m = new Queue(n);
		m.a[3] = 100;
		d[3] = 2000;
		for(int i=0;i<d.length+1;i++){
			int l = n.get();
			if(l != -1){
				System.out.print(l+"\t");
			}
			else System.out.print("The Queue is empty.\t" + n.i + "\t" + n.j);
		}

		System.out.println();

		for(int i=0;i<d.length;i++){
			System.out.print(m.get()+"\t");
		}
	}
}

output:

1	4	6	2000	34	8	3524	4	The Queue is empty.	0	0
1	4	6	100	34	8	3524	4	
