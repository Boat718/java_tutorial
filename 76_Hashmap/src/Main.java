import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		// HashMap implements the Map interface (need import)
		// HashMap is similar to ArrayList, but with key-value pairs
		// store objects, need to use Wrapper Class
		
		HashMap<String,String> countries = new HashMap<String,String>();
		
		//add a key and value
		countries.put("USA", "Washington DC");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Moscow");
		countries.put("Thailand", "Bangkok");
		
		//countries.remove("USA");
		//countries.clear();
		//countries.size();
		//countries.replace("USA", "LA");
		//countries.containsKey("Russia");
		//countries.containsValue("Bangkok");
		//System.out.println(countries.get("India"));
		
		for(String i : countries.keySet()) {
			System.out.print(i+"\t"+"= ");
			System.out.println(countries.get(i));
		}
		

	}

}
