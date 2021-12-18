package javabasic;

public class Lab8 {

	public static void main(String[] args) {
		
		lucky();

	}
	
	public static void count() {
		int i = 0;
		while(i<=20) {
			if(i == 11) {
				System.out.println(i);
				break;
			}
			++i;
		}
		
	}
	
	public static void lucky() {
		int i = 1;
		
		while(i<=10) {
			if(i==7) {
				System.out.println("Luck number\b"+i);
				break;
			}
			++i;
		}
	}
}
