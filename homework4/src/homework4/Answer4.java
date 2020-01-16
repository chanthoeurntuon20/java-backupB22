package homework4;

import java.util.Scanner;

public class Answer4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		 System.out.print("Enters your order:");
		 
		 /// Type of dataType
		 
		 char letter = sc.next().charAt(0); 
		switch(letter) {
			case 'a':
			case 'A':
				System.out.println("You order BayChha.");
				break;
			case 'b':
			case 'B':
				System.out.println("You order Ice Tea.");
				break;
			case 'c':
			case 'C':
				System.out.println("You order Shoup");
				break;
			case 'd':
			case 'D':
				System.out.println("You order Soup.");
				break;
				
			default: System.out.println("Out of order");
		}

}
}