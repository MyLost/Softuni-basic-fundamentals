package fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		int n = Integer.parseInt(scanner.nextLine());
		int[] rotationNumbers = new int[numbers.length];
		int index = 0;
		if(n < numbers.length) {
			index = n;
		} else {
			index = n - numbers.length;
		}
		int count = 0;
		for (int i = index; i < numbers.length; i++) {
			rotationNumbers[count] = numbers[i];
			count++;
		}
		count = 0;
		for (int i = numbers.length - index; i < numbers.length; i++) {
			rotationNumbers[i] = numbers[count];
			count++;
		}
		for (int i : rotationNumbers) {
			System.out.print(i + " ");
		}
	}
}
