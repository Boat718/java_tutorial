package youTube;

public class Inheritancee {

	public static void main(String[] args) {
		// Inheritance = the process where one class acquires,
		// 				the attributes and methods of another.
		
		bicycle aa = new bicycle(999);
		
		System.out.println(aa.speed);

	}

}

class Vehicle{
	double speed;
	
	void go() {
		System.out.println("GOoooo");
	}
	
	void stop() {
		System.out.println("Stopppppp");
	}
}

class bicycle extends Vehicle{
	
	bicycle(double speed){
		this.speed = speed;
	}
	
}