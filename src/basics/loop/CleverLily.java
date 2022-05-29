package basics.loop;

import java.util.Scanner;

public class CleverLily {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age = Integer.parseInt(scanner.nextLine());
		double waterMachinePrice = Double.parseDouble(scanner.nextLine());
		int gamePrice = Integer.parseInt(scanner.nextLine());
		double finalMoney = 0d;
		double givenMoney = 0;
		for (int i = 1; i <= age; i++) {
			if(i%2 == 0) {
				finalMoney +=10.00 + givenMoney;
				givenMoney += 10.00;
				finalMoney -=1.00;
			} else {
				finalMoney += gamePrice;
			}
		}

		if(finalMoney >= waterMachinePrice) {
			System.out.println(String.format("Yes! %.2f", finalMoney - waterMachinePrice));
		} else {
			System.out.println(String.format("No! %.2f", Math.abs(finalMoney - waterMachinePrice)));
		}
	}
}
