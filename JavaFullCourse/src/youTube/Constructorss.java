package youTube;

public class Constructorss {

	public static void main(String[] args) {
		// constructor = special method that is called when an object is instantiated (Created)
		
		Human human1 = new Human("B",99);
		Human human2 = new Human("C",101);
		
		System.out.println(human2.a);
		human1.eat();

	}

}

class Human{
	
	
	String n;
	int a;
	
	//constructor
	Human(String name,int age){
		this.n = name;
		this.a = age;
	}
	
	void eat() {
		System.out.println(this.n+" is eating");
	}
	
}
