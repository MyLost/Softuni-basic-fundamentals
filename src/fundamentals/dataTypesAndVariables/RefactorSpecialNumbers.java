package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		int digit = 0;
		boolean isSpecialNum = false;
		for (int i = 1; i <= number; i++) {
			digit = i;
		    while (digit > 0) {
		        sum += digit % 10;
		        digit = digit / 10;
		    }
		    isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
		    if(isSpecialNum) {
		    	System.out.printf("%d -> True%n", i);
		    } else {
		    	System.out.printf("%d -> False%n", i);
		    }
		    sum = 0;
		    digit = 0;
		}
	}
}
