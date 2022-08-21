package fundamentals.exams.mid;

import java.util.Scanner;

public class SoftUniReception {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int employeeOne = Integer.parseInt(scanner.nextLine());
		int employeeTwo = Integer.parseInt(scanner.nextLine());
		int employeeThree = Integer.parseInt(scanner.nextLine());
		
		int numberOfStudents = Integer.parseInt(scanner.nextLine());
		
		int numberOfHelpedStudentsPerHour = employeeOne + employeeTwo + employeeThree;
		
		int neededHours = 0;
		while(numberOfStudents > 0 ) {
			neededHours++;	
			if(neededHours % 4 != 0) {
				numberOfStudents -= numberOfHelpedStudentsPerHour;
			}
		}
		System.out.println(String.format("Time needed: %dh.", neededHours));
	}
}
