import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// polymorphism = many shapes/forms
		// dynamic = after compilation (during runtime)

		Scanner scanner = new Scanner(System.in);
		Animal animal;

		System.out.println("What animal do you want?");
		System.out.print("(1=dog) or (2=cat): ");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
			scanner.close();
		}
		else if(choice ==2) {
			animal = new Cat();
			animal.speak();
			scanner.close();
		}
		else {
			animal = new Animal();
			animal.speak();
			scanner.close();
		}

	}

}
