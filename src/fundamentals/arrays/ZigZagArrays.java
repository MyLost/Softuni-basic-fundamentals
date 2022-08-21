package fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int[] arrayOne = new int[n];
		int[] arrayTwo = new int[n];
		
		int zeroElem = 0;
		int firstElem = 1;
		
		for (int i = 0; i < n; i++) {
			int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
			arrayOne[i] = numbers[zeroElem]; 
			arrayTwo[i] = numbers[firstElem];
			
			int tmp = zeroElem;
			zeroElem = firstElem;
			firstElem = tmp;
		}
		for (int i : arrayOne) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : arrayTwo) {
			System.out.print(i + " ");		
		}	
	}
}
