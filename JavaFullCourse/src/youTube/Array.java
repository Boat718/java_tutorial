package youTube;

public class Array {

	public static void main(String[] args) {
		// arr = used to store multiple values in a single variable
		// data type of arr [] = {};
		/*
		String[] cars = {"BMW","BENZ","Tesla"};
		int[] Arr = {1,2,3,4,5,5};
		System.out.println(Arr.length);
		System.out.println(cars[2]);
		//for each
		for(String x : cars) {
			System.out.println(x);
		}*/
		
		TwoArr();

	}
	
	public static void TwoArr() {
		// 2D array = an array of array
		/*
		String[][] car = new String[3][3];
		car[0][0] = "Camero";
		car[0][1] = "Honda";
		car[0][2] = "Tesla";
		car[1][0] = "Mustang";
		car[1][1] = "Ferrari";
		car[1][2] = "Lambo";
		car[2][0] = "Toyota";
		car[2][1] = "Volvo";
		car[2][2] = "Kubota";
		*/
		
		String[][] car = { {"Camero","Honda"},{"Tesla","Mustang"},{"Ferrari","Lambo"} };
		
		System.out.println(car[2][1]);
	}

}
