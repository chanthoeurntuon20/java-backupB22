package homeworks;

public class Count {

	public static void main(String[] args) {
		String sentence = "this is the most common way";
		int count = 0;
		char letter = 'o';
		for(int i = 0 ; i < sentence.length(); i++) {
			if(sentence.charAt(i) == letter) {
				count++;
			}
		}
		System.out.println("There are"+ " " + count+" "  + "letter o in This is the most commeon way.");

	}

}
