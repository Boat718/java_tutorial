package javabasic;

import java.util.Scanner;


public class Lab4 {

	public static void main(String[] args) {
		
		//1
		/*
		Scanner unit = new Scanner(System.in);
		int unitt = unit.nextInt();
		
		if(unitt >=1 && unitt <=50) {
			System.out.print("Price  \t");
			System.out.println(unitt*4.25);
		}
		else if(unitt >= 51 && unitt <= 100) {
			System.out.print("Price  \t");
			System.out.println(unitt*3.25);
		}
		else {
			System.out.print("Price \t");
			System.out.println(unitt*2.25);
		}
		*/
		
		
		Scanner input = new Scanner (System.in);
		int year = input.nextInt();
		int x = 2000;
		int y = 365;
		int total = (year*y)+x;
		
		if(total >= 5000) {
			System.out.print("Pass \t");
			System.out.println(total);
		}else {
			System.out.print("Not Pass \t");
			System.out.println(total);
		}
		
	

	}

}
