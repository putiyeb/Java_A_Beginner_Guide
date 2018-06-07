class Fruit {
	private String color;
	private String weight;

	Fruit(String a, String b){
		color = a;
		weight = b;
	}
	public String getColor(){
		return color;
	}
	public String getWeight(){
		return weight;
	}
	public void setColor(String a){
		color = a;
	}
	public void setWeight(String b){
		weight = b;
	}
}

class Apple extends Fruit {
	private String taste;
	Apple(String a, String b, String c){
		super(a,b);
		taste = c;
	}
	public String getTaste(){
		return taste;
	}
	public void setTaste(String a){
		taste = a;
	}
}

class Test {
	public static void main(String args[]){
		Apple a = new Apple("red","1kg","sweet");
		System.out.println("The color of apple is: "+ a.getColor());
		System.out.println("The weight of apple is: "+ a.getWeight());
		System.out.println("The taste of apple is: "+ a.getTaste());
		a.setColor("yellow");
		a.setWeight("2kg");
		a.setTaste("Good");
		System.out.println("The color of apple is: "+ a.getColor());
		System.out.println("The weight of apple is: "+ a.getWeight());
		System.out.println("The taste of apple is: "+ a.getTaste());
	}
}

output:

The color of apple is: red
The weight of apple is: 1kg
The taste of apple is: sweet
The color of apple is: yellow
The weight of apple is: 2kg
The taste of apple is: Good
