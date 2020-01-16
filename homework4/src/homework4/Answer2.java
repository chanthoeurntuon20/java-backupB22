package homework4;

public class Answer2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 50) {
			if(i % 2 == 0) {
				sum += i;	
			}
			i++;
		}
		System.out.println("Sum of even number:" + " " + sum);

	}

}
