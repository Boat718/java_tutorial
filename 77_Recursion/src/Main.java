import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Recursion = the process in which a method calls itself continuously
		// A method that calls itself is called a "Recursive method"
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How far do you want to walk: ");
		int dis = scanner.nextInt();
		
		takeAStep(0,dis);

	}
	
	static void takeAStep(int i, int distance) {
		if(i<distance) {
			i++;
			System.out.println("**you take a step: "+i+" meter/s");
			takeAStep(i,distance);
		}else {
			System.out.println("You'r done walking");
		}
	}

}
