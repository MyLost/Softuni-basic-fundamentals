package basics.loop;

import java.util.Scanner;

public class SumPrimeNonPrime {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();
		int sum = 0;
		int primeSum = 0;
		boolean isPrime = true;
		while(!command.equals("stop")) {
			int chekedNumber = Integer.parseInt(command);
			int m = chekedNumber/2;
			for (int i=2; i<=m; i++) {
				if(chekedNumber % i == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
			if(chekedNumber < 0) {
				System.out.println("Number is negative.");
			} else if(isPrime) {
				primeSum +=chekedNumber;	
			} else {
				sum +=chekedNumber;
			}
			command = scanner.nextLine();
		}
		System.out.println(String.format("Sum of all prime numbers is: %d", primeSum));
		System.out.println(String.format("Sum of all non prime numbers is: %d", sum));
	}
}
