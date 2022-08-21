package basics.loop;

import java.util.Scanner;

public class NumberSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(scanner.nextLine());
			if(number < minNumber) {
				minNumber = number;
			}
			if(number > maxNumber) {
				maxNumber = number;
			}
		}
		System.out.println("Max number: " + maxNumber);
		System.out.println("Min number: " + minNumber);
	}
}
