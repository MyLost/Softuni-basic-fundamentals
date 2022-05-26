package basics;

import java.util.Scanner;

public class BasketballEquipment {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int annualFee = Integer.parseInt(scanner.nextLine());

		double sneakers =  annualFee - annualFee * 0.4;
		double outfit = sneakers - sneakers * 0.2;
		double ball = outfit / 4;
		double accessories = ball / 5;
		
		System.out.println(sneakers + outfit + ball + accessories + annualFee);
		
	}
}
