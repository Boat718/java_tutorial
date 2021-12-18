package youTube;

import java.util.Scanner;

public class Mathhh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x;
		double y;
		double z;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter x : ");
		x = input.nextDouble();
		
		System.out.print("Enter y: ");
		y = input.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("Result : "+z);
		
		input.close();
		
		
	
	}

}
