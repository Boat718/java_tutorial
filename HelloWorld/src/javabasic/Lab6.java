package javabasic;

public class Lab6 {

	public static void main(String[] args) {
		/*
		int i =1 ;
		while(i<=10) {
			System.out.println(i);
			++i;
		}
		*/
	optional();

	}
	
	public static void sum() {
		int total = 0;
		for(int i = 1 ; i <= 10; i++) {
			total += i;
			System.out.println(total);
			
		}
	}
	
	public static void number() {
		int i = 1;
		while(i<=100) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			++i;
		}
	}
	
	public static void arr() {
		int [] ar = {1,2,3,4,5};
		
		for(int i:ar) {
			System.out.println(i);
		}
		
	}
	
	public static void optional() {
		for(int i = 0; i <=12 ; i+=2) {
			if(i == 12) {
				System.out.println("Already");
			}
		}
	}

}
