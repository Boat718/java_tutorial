package youTube;

import java.util.Random;

public class VariableScop {

	public static void main(String[] args) {
		 //local =  declared inside a method
		  //   visible only to that method
		  
		  //global  = declared outside a method, but within a class
		  //   visible to all parts of a class
		Rand vs = new Rand();

	}

}

class Rand{
	//Global
	Random num = new Random();
	int n;
	Rand(){
		roll();
	}
	void roll(){
		//local
		n = num.nextInt(6)+1;
		System.out.println(n);
	}
}
