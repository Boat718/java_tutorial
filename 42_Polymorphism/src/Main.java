
public class Main {

	public static void main(String[] args) {
		// polymorphism = 	greek word for poly-"many", morph-"form"
		//					The ability of an object to identify as more than one DAta type
		
		Car car = new Car();
		Bike bike = new Bike();
		Boat boat = new Boat();
		
		//Car[] arr = {car,bike,boat}; not work
		
		Vehicle[] arr = {car,bike,boat}; 
		
		for(Vehicle x: arr) {
			x.go();
		}

	}

}
