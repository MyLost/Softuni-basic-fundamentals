package fundamentals.dataTypesAndVariables;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ExactSumOfRealNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numbers = Integer.parseInt(scanner.nextLine());
		BigDecimal number = null;
		BigDecimal sum = new BigDecimal(0);
		int count = 0;
		while(count < numbers) {
			number = new BigDecimal(scanner.nextLine());
			sum = sum.add(number);
			count++;
		}
		System.out.println(sum);
	}
}
