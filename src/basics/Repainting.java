package basics;

import java.math.BigDecimal;
import java.util.Scanner;

public class Repainting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nylon = Integer.parseInt(scanner.nextLine());
		int paint = Integer.parseInt(scanner.nextLine());
		int diluent = Integer.parseInt(scanner.nextLine());
		int hours = Integer.parseInt(scanner.nextLine());
		
		
		double naylonSum = (nylon+2) * 1.50;
		double paintPercent = 1.10;
		double paintSum = paint * paintPercent * 14.50;
		double diluentSum = diluent * 5.00;
		double bags = 0.40;
		double artificerCosts = ((naylonSum + paintSum + diluentSum + bags) * 30 / 100)*hours;
		double sum = naylonSum + paintSum + diluentSum + bags + artificerCosts; 
		System.out.println(sum);
	}

}
