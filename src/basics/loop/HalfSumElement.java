package basics.loop;

import java.util.Scanner;

public class HalfSumElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int[] arr = new int[n];
		int maxElement=0;
		int sum = 0;
		int allElementsSum = 0;
		boolean noElementFound = false;
		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(scanner.nextLine());
			allElementsSum += number;
			arr[i] = number;
			if(number > maxElement) {
				maxElement = number;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			sum=0;
			
			for (int j = 0; j < arr.length; j++) {
				if(i == j) {
					continue;
				}
				sum +=arr[j];
			}
			if(maxElement == arr[i]) {
				allElementsSum = sum;
			}
			if(arr[i] == sum) {
				noElementFound = true;
				System.out.println("Yes");
				System.out.println("Sum = " + sum);
				break;
			} 
		}
		if(!noElementFound) {
			System.out.println("No");
			System.out.println("Diff = " + Math.abs(maxElement - allElementsSum));
		}
	}
}
