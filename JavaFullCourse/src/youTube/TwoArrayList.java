package youTube;

import java.util.ArrayList;

public class TwoArrayList {

	public static void main(String[] args) {
		// 2D ArrayList = a dynamic list of lists
		// you can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		
		ArrayList<String> bakeyList = new ArrayList();
		bakeyList.add("donuts");
		bakeyList.add("pasta");
		bakeyList.add("Cake");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("peppers");
		produceList.add("zucchini");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("CocaCola");
		drinkList.add("Coffee");
		
		groceryList.add(bakeyList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		
		System.out.println(groceryList.get(0).get(0));

	}

}
