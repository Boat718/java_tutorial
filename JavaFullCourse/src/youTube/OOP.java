package youTube;

public class OOP {

	public static void main(String[] args) {
		// Object = an instance of a class that may contain attributes and methods
		Car mycar = new Car(); //object
		Car mycar2 = new Car();
		
		//System.out.println(mycar.make);
		mycar.drive();
		mycar2.brake();

	}

}

class Car{
	
	String make = "Ferrari"; //attributes
	int year = 2021;
	double price = 99.9999;
	//Methods
	void drive() {
		System.out.println("U drive the car"); 
	}
	
	void brake() {
		System.out.println("U step on the brakes");
	}
}
