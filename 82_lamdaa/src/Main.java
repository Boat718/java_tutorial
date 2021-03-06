
public class Main {

	public static void main(String[] args) {
		/* Lambda expression = feature for java8 and above
		 * 						also known as a anonymous method
		 * 						a shorter way to write anonymous classes with only one method
		 * 
		 * 						need to use a functional interface or use a pre-defined functional interface
		 * 						they contain only one abstract method
		 * 						ex. ActionListener, Runnable(user-defined)
		 * 
		 * 						A lambda expression can be used in any place where a functional interface is required
		 * 						How to use a lambda expression:
		 * 						(arguments)->{statements}
		*/
		
		String name = "BOAT";
		
		MyInterface myinterface = (X)->{ 
			System.out.println("Hello WOrld");
			System.out.println(X);
		
		};
		
		myinterface.message(name);
	}

}
