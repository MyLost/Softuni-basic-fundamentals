package basics.loop;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BigDecimal sum = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
		int coinsNumber = 0;
		while(sum.doubleValue() > 0.00) {
			coinsNumber++;
			if(sum.doubleValue() >= 2.0) {
				sum = new BigDecimal(sum.doubleValue() - 2.0).round(new MathContext(3));
			} else if(sum.doubleValue() >= 1.0) {
				sum = new BigDecimal(sum.doubleValue() - 1.0).round(new MathContext(2));
			} else if(sum.doubleValue() >= 0.50) {
				sum = BigDecimal.valueOf(sum.doubleValue() - 0.5).round(new MathContext(2));
			} else if(sum.doubleValue() >= 0.20) {
				sum = BigDecimal.valueOf(sum.doubleValue() - 0.2).round(new MathContext(2));
			} else if(sum.doubleValue() >= 0.10) {
				sum = BigDecimal.valueOf(sum.doubleValue() - 0.1).round(new MathContext(2)); 
			} else if(sum.doubleValue() >= 0.05) {
				sum = BigDecimal.valueOf(sum.doubleValue() - 0.05).round(new MathContext(2));
			} else if(sum.doubleValue() >= 0.02) {
				sum = BigDecimal.valueOf(sum.doubleValue() - 0.02).round(new MathContext(2));
			} else {
				sum = new BigDecimal(sum.doubleValue() - 0.01).round(new MathContext(2));
			}
		}
		System.out.println(coinsNumber);
		scanner.close();
	}
}
