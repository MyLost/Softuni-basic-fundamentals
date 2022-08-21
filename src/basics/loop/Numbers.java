package basics.loop;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int maxNumber = Integer.parseInt(scanner.nextLine());
		int number;
		int sum = 0;
		while(sum < maxNumber) {
			number = Integer.parseInt(scanner.nextLine());
			sum = sum + number;
		}
		System.out.println(sum);
		scanner.close();
	}
}
