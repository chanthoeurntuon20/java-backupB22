package homewok3;

public class Answer4 {

	public static void main(String[] args) {
		///for get when user input
	}
		Scanner sc = new Scanner(System.in); 
		 System.out.print("Enter name:");
		 
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
				System.out.println("You order Ice Tea.");
				break;
			case 'd':
			case 'D':
				System.out.println("You order Soup.");
				break;
				
				default:
					System.out.println("Out of order");
				
	}

}
