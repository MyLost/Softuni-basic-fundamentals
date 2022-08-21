package fundamentals.basics;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = Integer.parseInt(scanner.nextLine());
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " X " + i + " = " + number*i);
		} 
	}
}
