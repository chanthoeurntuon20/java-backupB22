package com.class_object;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		 System.out.print("Enter:");
		 	int a = 10;
			int b = 20;
			int c = 50;
			int d = 100;
			int e =200;
			int total = 150;

		 char letter = sc.next().charAt(0); 
		switch(letter) {
			case 'a':
			case 'A':
				
				for(int i = 1; i <= 50; i++) {
					if(total > 0) {
						total = total - a;
						System.out.println(a);
					}else {
						System.out.println(total);
					}
					
				}
				System.out.println("Enter A or a to display " + total+ "entities per page");
				System.out.println("============================================");
				break;
			case 'b':
			case 'B':
				System.out.println("You order Ice Tea.");
				break;
			case 'c':
			case 'C':
				System.out.println("You order Ice Tea.");
				break;
			case 'd':
			case 'D':
				System.out.println("You order Soup.");
				break;
				
			default: System.out.println("Out of order");
		}

	}
}
