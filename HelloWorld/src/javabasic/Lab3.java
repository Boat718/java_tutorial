package javabasic;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
	/*	
	 * int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i); //25
		
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println(i);
		
		float a = 2.234f;
		float c = 3.27f;
		if((a == c) && (a != c)) {
			System.out.println("AAA");
		}else {
			System.out.println(false);
		}

	} 
	*/
		Scanner num = new Scanner (System.in);
		int value = num.nextInt();
		
		if(value%2 == 0) {
			System.out.println("This is even number");
		}else {
			System.out.println("This is odd number");
		}
	}

}
