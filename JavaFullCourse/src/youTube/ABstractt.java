package youTube;

public class ABstractt {

	public static void main(String[] args) {
		// abstract =  	abstract classes cannot be instantiated, but they can have a subclass
		//				abstract methods are declared without an implementation

		Bikeee bb = new Bikeee();
		bb.go();
	}
	

}

abstract class Vvehicle {
	abstract void go();
}

class Bikeee extends Vvehicle {
	@Override
	void go() {
		System.out.println("GOOOOO");
	}
}
