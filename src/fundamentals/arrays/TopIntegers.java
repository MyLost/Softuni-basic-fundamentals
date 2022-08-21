package fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		for (int i = 0; i < numbers.length -1; i++) {
			boolean flag = false;
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.print(numbers[numbers.length-1] + " ");
	}
}
