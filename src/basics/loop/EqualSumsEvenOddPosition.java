package basics.loop;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOne = Integer.parseInt(scanner.nextLine());
		int numberTwo = Integer.parseInt(scanner.nextLine());
		int sumOdd = 0;
		int sumEven = 0;
		for (int i = numberOne; i <= numberTwo; i++) {
			for (int j = 0; j < String.valueOf(i).length(); j++) {
				if(j % 2 == 0) {
					sumEven += String.valueOf(i).charAt(j);
				} else {
					sumOdd += String.valueOf(i).charAt(j);
				}
			}
			if(sumEven == sumOdd) {
				System.out.printf("%d ",i);
			}
			sumOdd = 0;
			sumEven = 0;
		}
		scanner.close();
	}
}
