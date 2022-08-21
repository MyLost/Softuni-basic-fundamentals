package fundamentals.basics;

import java.util.Scanner;

public class Passed {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float grade = Float.parseFloat(scanner.nextLine());
		
		if(grade >= 3.00) {
			System.out.println("Passed!");
		}
	}
}
