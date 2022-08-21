package fundamentals.basics;

import java.util.Scanner;

public class PassedOrFailed {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float grade = Float.parseFloat(scanner.nextLine());
		
		if(grade >= 3.00) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}

	}

}
