package homeworks;

public class Uppercase {

	public static void main(String[] args) {
		String text = "welcome";
		String first = text.substring(0,text.length() -3);
		String last = text.substring(4,text.length()).toUpperCase();
		System.out.println( "From welcom to "+ first + last);

	}

}
