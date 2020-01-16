
public class Answer1 {

	public static void main(String[] args) {
		String[] employee = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
		int[] salary = { 560, 560, 500, 500, 190, 190, 560, 700 };
		int highest = salary[0];
		int lowest = salary[0];
		double average = 1;
		int sum = 0;
		int same = salary[0];
		String line = "---------------------------------";
		/// Answer1
		for (int i = 0; i < salary.length; i++) {
			if (highest < salary[i]) {
				highest = salary[i];
			}
		}
		for (int j = 0; j < employee.length; j++) {
			if (highest == salary[j]) {
				System.out.println("1.Employee who has highest salary: ");
				System.out.println(employee[j] + " " + "has the highest salary of " + "$" + highest);
				System.out.println(line);
			}

		}
		/// Answer2
		for (int i = 0; i < salary.length; i++) {
			if (lowest > salary[i]) {
				lowest = salary[i];
			}
		}
		System.out.println("2.Employee who has highest salary: ");
		for (int j = 0; j < employee.length; j++) {
			if (lowest == salary[j]) {
				System.out.println(employee[j] + " " + "has the lowest salary of " + "$" + lowest);

			}
		}
		/// Answer3
		System.out.println(line);
		for (int i = 0; i < salary.length; i++) {
			sum += salary[i];
			average = sum / salary.length;
		}
		System.out.println("3.Employee who has lower salary than average: " + average);
		for (int j = 0; j < employee.length; j++) {
			if (salary[j] < average) {
				System.out.println(employee[j] + ": " + "$" + salary[j]);
			}
		}

		/// Answer4
		System.out.println(line);
		System.out.println("4.Employee who has higher salary than average: " + average);
		for (int i = 0; i < salary.length; i++) {
			if (highest < salary[i]) {
				highest = salary[i];
			}
		}
		for (int j = 0; j < employee.length; j++) {
			if (salary[j] > average) {
				System.out.println(employee[j] + ": " + "$" + salary[j]);
			}
		}
		System.out.println(line);
		System.out.println("5. Employee who has same salary:");
		for (int j = 0;j<employee.length;j++) {
			if(same >= salary[j]) {
				
				System.out.println(employee[j]+": "+"$"+salary[j]);
			}
		}

	}

}
