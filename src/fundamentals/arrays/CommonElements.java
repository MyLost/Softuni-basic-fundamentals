package fundamentals.arrays;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		String[] arrayOne = scanner.nextLine().split(" ");
		String[] arrayTwo = scanner.nextLine().split(" ");
		
		for (int i = 0; i < arrayOne.length; i++) {
			for (int j = 0; j < arrayTwo.length; j++) {
				if(arrayOne[i].equals(arrayTwo[j])) {
					System.out.print(arrayOne[i] + " ");
				}
			}
		}
	}
}
