package youTube;

public class ArrofObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Food[] arrOfFoods = new Food[3];
		
		Food arr1 = new Food("Pizza");
		Food arr2 = new Food("Hamburger");
		Food arr3 = new Food("KFC");
		
		
		//arrOfFoods[0] = arr1;
		//arrOfFoods[1] = arr2;
		//arrOfFoods[2] = arr3;
		
		Food[] arr = {arr1,arr2,arr3};		
		
		//System.out.println(arrOfFoods[0].name);
		
		System.out.println(arr[1].name);
	}

}

class Food {
	String name;
	
	Food(String n){
		this.name = n;
	}
}