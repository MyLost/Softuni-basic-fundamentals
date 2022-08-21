package fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		int sum = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] + numbers[j] == sum) {
					System.out.println(numbers[i] + " " + numbers[j]);
				}
			}
		}

	}
}
