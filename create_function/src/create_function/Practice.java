package create_function;

public class Practice {

	public static void main(String[] args) {
		System.out.println (numberOfA("I love my parents"));
	}
	public static int numberOfA(String text) {
		int count = 0;
		String index = "";
		for(int i = 0 ; i < text.length(); i++) {		
			if(text.charAt(i) == 'a' || text.charAt(i) == 'A') {
				count++;
				index = index + i;
			}		
		}		
		return count;
	}

}
///charAt use to get charater one letter
