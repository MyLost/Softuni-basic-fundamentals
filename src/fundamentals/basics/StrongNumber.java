package fundamentals.basics;

import java.util.Iterator;
import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int originalNumber = n;
		int digit = 0;
		int factoriel =1;
		int sum =0;
		
		while (true) {
			factoriel =1;
			if(n < 1) {
				break;
			}
			if(n == 1) {
				digit = n;
			} else {
				digit = n % 10;
			}
			for (int i = 1; i <= digit; i++) {
				factoriel = factoriel * i;
			}
			sum += factoriel;
			n = n / 10;
		}
		if(originalNumber == sum) {
			System.out.println("yes");

		} else {
			System.out.println("no");
		}
	}
}
