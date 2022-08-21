package basics.loop;

import java.util.Scanner;

public class SpecialNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = Integer.parseInt(scanner.nextLine());
		boolean isSPecialNumber = false;
		boolean isZeroDevider = false;
		for (int i = 1111; i <= 9999; i++) {
			for (int j = 0; j < String.valueOf(i).length(); j++) {
				int devider = Character.getNumericValue(String.valueOf(i).charAt(j));
				if(devider == 0 ) {
					isZeroDevider = true;
					break;
				}
				isZeroDevider = false;
				if(number % devider == 0 ) {
					isSPecialNumber = true;
				} else {
					isSPecialNumber = false;
					break;
				}
			}
			if(isSPecialNumber && !isZeroDevider) {
				System.out.printf("%d ", i);
			}
		}
	}
}
