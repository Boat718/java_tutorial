package youTube;

public class SuperKeyWOrd {

	public static void main(String[] args) {
		// super = 	keyword refers to the superclass (parent) of an object
		//			very similar to the "this" keyword
		
		Hero h1 = new Hero("Batman",39,"RIch");
		
		System.out.println(h1.toString());

	}

}

class Person{
	String name;
	int age;
	Person(String n, int age){
		this.name = n;
		this.age = age;
	}
	
	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}
	
}

class Hero extends Person {
	String power;
	Hero(String name, int age, String p){
		super(name,age); // pass value of main constructor
		this.power = p;
		
	}
	
	public String toString()  {
		return super.toString()+this.power;
	}
	
	
	
	
}
