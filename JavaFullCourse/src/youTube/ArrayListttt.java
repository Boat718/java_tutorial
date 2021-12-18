package youTube;

import java.util.ArrayList;

public class ArrayListttt {

	public static void main(String[] args) {
		// ArrayList = a resizable array.
		//				Elements can be added and removed after compilation phase
		// 				store reference data types
		
		// import java.util.ArrayList;
		// ArrayList<WrapperClass> name = new ArrayList <WrapperClasee>();
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("hotdog");
		
		food.set(0, "Sushi"); //replace
		food.remove(2);
		food.clear(); 
		
		
		for(int i =0; i< food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
