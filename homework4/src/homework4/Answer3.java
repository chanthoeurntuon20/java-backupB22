package homework4;

public class Answer3 {

	public static void main(String[] args) {
		double agrs = 0;
		int count = 0;
		int sum = 0;
		int i = 1;
		do {
			if(i % 2 != 0) {
				count++;
				sum += i;	
			}	
			i++;
		}while(i <= 50);
		agrs = sum / count;
		System.out.println( "The average of odd number:"+ " "+agrs);
		
	}

}
