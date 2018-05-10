
class Test {
	// test jaca
	public static void main(String args[]) {
		System.out.println("P\tQ\tAND\tOR\tNOT\tXOR\t&&\t||");
		boolean P = true;
		boolean Q = true;
		System.out.println(P+"\t"+Q+"\t"+(P&Q)+"\t"+(P|Q)+"\t"+!P+"\t"+(P^Q)+"\t"+(P&&Q)+"\t"+(P||Q));
		P = false;
		Q = true;
		System.out.println(P+"\t"+Q+"\t"+(P&Q)+"\t"+(P|Q)+"\t"+!P+"\t"+(P^Q)+"\t"+(P&&Q)+"\t"+(P||Q));
		P = true;
		Q = false;
		System.out.println(P+"\t"+Q+"\t"+(P&Q)+"\t"+(P|Q)+"\t"+!P+"\t"+(P^Q)+"\t"+(P&&Q)+"\t"+(P||Q));
		P = false;
		Q = false;
		System.out.println(P+"\t"+Q+"\t"+(P&Q)+"\t"+(P|Q)+"\t"+!P+"\t"+(P^Q)+"\t"+(P&&Q)+"\t"+(P||Q));

	}
}


Output:

P	Q	AND	OR	NOT	XOR	&&	||
true	true	true	true	false	false	true	true
false	true	false	true	true	true	false	true
true	false	false	true	false	true	false	true
false	false	false	false	true	false	false	false
