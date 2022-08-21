package fundamentals.basics;

import java.util.Scanner;

public class StudentInformation {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String studentName = scanner.nextLine();
		int studentAge = Integer.parseInt(scanner.nextLine());
		float studentGrade = Float.parseFloat(scanner.nextLine());
		
		System.out.println(String.format("Name: %s, Age: %d, Grade: %.2f ", studentName, studentAge, studentGrade));
		
	}
}
