package youTube;

public class MethodOverriding {

	public static void main(String[] args) {
		// method overriding = 	Declaring a method in sub class,
				//				which is already present in parent class.
				//				done so that a child class can give its own implementation
		Animal animal = new Animal();
		dog Dog = new dog();
		
		animal.speak();
		Dog.speak();
	}

}

class Animal{
	void speak() {
		System.out.println("From Animal");
	}
}

class dog extends Animal {
	@Override
	void speak() {
		System.out.println("From DOG");
	}
	
}
