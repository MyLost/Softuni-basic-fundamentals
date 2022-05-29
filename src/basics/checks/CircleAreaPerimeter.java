package basics.checks;

import java.util.Scanner;

public class CircleAreaPerimeter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double radius = Double.parseDouble(scanner.nextLine());
		
		System.out.println(String.format("%.2f", Math.PI*radius*radius));
		System.out.println(String.format("%.2f", Math.PI*radius*2));
	}
}
