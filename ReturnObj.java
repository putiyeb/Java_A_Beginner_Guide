class Fail {
	public int a;
	public String b;
	public Fail(int inter,String str){
		a = inter;
		b = str;
	}
}

class Write {
	public int[] a = {1,1,2,4};
	public String b[] = {"ttt1","ttt2","ttt3","ttt4"};
	public Fail obj(int i){
		Fail j;
		if(i>=0 && i<a.length){
			j = new Fail(a[i],b[i]);
			return j;
		}else{
			return j=new Fail(-1,"Invalid");
		}
	}
}

class Test {
	public static void main(String args[]) {
		Write n = new Write();
		Fail l = n.obj(3);
		Fail k = n.obj(10);
		System.out.println(l.b+"\t"+l.a);
		System.out.println(k.b+"\t"+k.a);
	}
}

output:

ttt4	4
Invalid	-1
