package javabasic;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		//draw1();
		draw8();
	}
	/*
	@SuppressWarnings("resource")
	public static void draw1() {
		Scanner input = new Scanner (System.in);
		System.out.println("Input num: ");
		int x = input.nextInt();
		
		String p = "*";
		for(int i = 1; i < x; i++) {
			p+="*";
		}
		System.out.println(p);
	}
	
	public static void draw2() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Input num: ");
		int x = input.nextInt();
		
		for(int i = 1; i <= x; i++) {
			String p = "*";
			for(int j = 1; j<x; j++) {
				p+="*";
			}
			System.out.println(p);
		}
	}
	
	public static void draw3() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Input num: ");
		int x = input.nextInt();
		
		for(int i = 1; i <= x; i++) {
			String p = "";
			for(int j = 1; j<=x; j++) {
				
				p+=j;
			}
			System.out.println(p);
		}
	}
	
	public static void draw4() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Input num: ");
		int x = input.nextInt();
		
		for(int i = 1; i <= x; i++) {
			String p = "";
			for(int j = x; j>=1; j--) {
				p+=j;
			}
			System.out.println(p);
		}
	}
	
	public static void draw5() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Input num: ");
		int x = input.nextInt();
		
		for(int i = 1; i <= x; i++) {
			String p = ""+i  ;
			for(int j = 1; j< x; j++) {
				p += i;
			}
			System.out.println(p);
		}
	}
	
	public static void draw6() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Input num: ");
		int x = input.nextInt();
		
		for(int i = x; i >= 1; i--) {
			String p = ""+i  ;
			for(int j = 1; j< x; j++) {
				p += i;
			}
			System.out.println(p);
		}
	}
	
	
	public static void draw7() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Input num: ");
		int x = input.nextInt();
		
		for(int i = 1; i <= x*x; i+= x) {
			String p = ""  ;
			for(int j = i; j<i+x; j++) {
				
				p += j;
			}
			System.out.println(p);
		}
	}*/
	
	public static void draw8() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Input num: ");
		int x = input.nextInt();
		
		for(int i = x*x; i >= 1; i-=x) {
			String p = ""  ;
			for(int j = i; j>i-x; j--) {
				p += j;
			}
			System.out.println(p);
		}
	}
}
