package fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arrayOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		int[] arrayTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		int sum = 0;
		boolean flag = false;
		for (int i = 0; i < arrayTwo.length; i++) {
			if(arrayOne[i] != arrayTwo[i]) {
				flag=true;
				System.out.println(String.format("Arrays are not identical. Found difference at %d index.", i));
				break;
			} else {
				sum += arrayOne[i];
			}
		}
		if(!flag) {
			System.out.println(String.format("Arrays are identical. Sum: %d", sum));
		}
	}

}
