package fundamentals.basics;

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int sum =0;
		int counter = 0;
		int number = 1;
		
		while(counter != n) {
			
			if(number % 2 != 0) {
				System.out.println(number);
				sum += number;
				counter++;
			}
			
			number++;
		}
		System.out.println("Sum: " + sum);
	}

}
