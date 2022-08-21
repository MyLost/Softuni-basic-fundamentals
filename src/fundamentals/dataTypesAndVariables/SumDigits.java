package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		
		while(true) {
			int digit = number % 10;
			sum += digit;
			number = number/10;
			if(number <= 0) {
				break;
			}
		}
		System.out.println(sum);
	}
}
