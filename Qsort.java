class Qsort {
	int[] a;
	public Qsort(int[] b){
		a=b;
	}

	public int[] qs(int i, int j){
		int left=i,right=j,middle = (left+right)/2;
		do{
			while((a[left]<a[middle]) && (left<j)) left++;
			while((a[right]>a[middle]) && (right>i)) right--;
			int temp;
			if(left<=right){
				temp = a[right];
				a[right] = a[left];
				a[right] = temp;
				left++;
				right--;
			}
		}while(left<=right);
		if(i<right) qs(i,right);
		if(j>left) qs(left,j);
		return a;
	}
}


class Test {
	public static void main(String args[]) {
		int d[] = {324,456,7,7,2,8,0,345};
		Qsort c = new Qsort(d);
		c.qs(0,d.length-1);
		for(int k=0;k<d.length;k++){
			System.out.print(c.a[k]+"\t");
		}
	}
}

error output:

324	456	7	7	2	8	0	345	
