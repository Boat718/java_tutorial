package javabasic;

public class lab2 {
	public static void main (String[] args) {
		System.out.println("LAB2");
		bark();
		
		//2.
		float a =  5.7898f;
		int b = (int) a;
		//System.out.println(a);
		System.out.println(b);
		
		int c = 345;
		float d = (float) c;
		System.out.println(d);
		
		double e = 5.123123d;
		float f = (float) e;
		System.out.println(f);
		
		char g = 'b';
		int h = (int) g ;
		System.out.println(h);
		
		
		
	}
	
	public static void bark() {
		String dogName = "Dragon";
		System.out.println("The Dog name:"+dogName);
	}
}
