package homeworks;

public class FirstHalf {

	public static void main(String[] args) {
		String programing = "programing";
		String homework = "homework";
		String marker = "marker";
		String text = "is the first half of";
		
		System.out.println(programing.substring(0,programing.length()/2)+ " " + text+" "+ programing);
		System.out.println(homework.substring(0,homework.length()/2) + " "+ text + " "+ homework);
		System.out.println(marker.substring(0,marker.length()/2)+ " "+ text + " "+ marker);

	}

}
