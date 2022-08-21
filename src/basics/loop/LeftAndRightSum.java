package basics.loop;

import java.util.Scanner;

public class LeftAndRightSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int sumN1=0;
		for (int i = 0; i < n; i++) {
			int number1 = Integer.parseInt(scanner.nextLine());
			sumN1 +=number1;
		}
		
		int sumN2=0;
		for (int i = 0; i < n; i++) {
			int number2 = Integer.parseInt(scanner.nextLine());
			sumN2 +=number2;
		}
		if(sumN1 == sumN2) {
			System.out.println("Yes, sum = " + sumN1);
		}
		
		if(sumN1 != sumN2) {
			System.out.println("No, diff = " + Math.abs(sumN2-sumN1));
		}
	}
}
