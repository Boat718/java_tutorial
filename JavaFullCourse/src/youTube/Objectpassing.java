package youTube;

public class Objectpassing {

	public static void main(String[] args) {

		
		Garage g = new Garage();
		Carrrr name = new Carrrr("BMW");
		
		g.park(name);
	}
}

class Carrrr{
	String name;
	Carrrr(String n){
		this.name = n;
	}
}

class Garage{
	void park(Carrrr car) {
		System.out.println("The "+car.name+" is parking in garage");
	}
}



