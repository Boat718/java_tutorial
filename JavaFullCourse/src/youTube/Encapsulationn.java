package youTube;

public class Encapsulationn {

	public static void main(String[] args) {
		// Encapsulation = attributes of a class will be hidden or private,
		//					Can be accessed only through methods (getters & setters)
		//					You should make attributes private if u don't have a reason to make them public/protected.
		
		Carcar car = new Carcar("BMW","Series 8", 2021);
		
		car.setMake("BENZ");
		car.setModel("GT 63");
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}

}

class Carcar {
	private String make;
	private String model;
	private int year;
	
	Carcar(String make, String model, int year){
		setMake(make);
		setModel( model);
		setYear( year);
	}
	
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public int getYear() {
		return this.year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
