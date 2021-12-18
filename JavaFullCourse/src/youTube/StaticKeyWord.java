package youTube;

public class StaticKeyWord {

	public static void main(String[] args) {
		// static = modifier. A single copy of a variable/method is created and shared.
		//	The class "owns" the static member
		Ex n1 = new Ex("A");
		Ex n2 = new Ex("B");
		Ex n3 = new Ex("C");

		
		System.out.println(Ex.num);
	}

}
 class Ex {
	 String n;
	 static int num;
	 Ex(String name){
		 this.n = name;
		 num++;
	 }
	 
 }
