package basics.loop;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int startNumber = Integer.parseInt(scanner.nextLine());
		int endNumber = Integer.parseInt(scanner.nextLine());
		int magicNumber = Integer.parseInt(scanner.nextLine());
		int combinationPosition = 0;
		boolean combinationFound = false;
		boolean outerloop = false;
		int foundStartNumber =0;
		int foundEndNUmber = 0;
		for (int i = startNumber; i <= endNumber; i++) {
			if(outerloop) {
				break;
			}
			for (int j = startNumber; j <= endNumber; j++) {
				combinationPosition++;
				if(i+j == magicNumber) {
					combinationFound = true;
					foundStartNumber = i;
					foundEndNUmber = j;
					outerloop = true;
					break ;
					
				}
			}
		}
		if(!combinationFound) {
			System.out.println(String.format("%d combinations - neither equals %d", combinationPosition, magicNumber));
		} else {
			System.out.println(String.format("Combination N:%d (%d + %d = %d) ", combinationPosition, foundStartNumber, foundEndNUmber, magicNumber));
		}
	}
}
