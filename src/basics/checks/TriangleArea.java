package basics.checks;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double base = Double.parseDouble(scanner.nextLine());
		double height = Double.parseDouble(scanner.nextLine());
		
		System.out.println(String.format("%.2f",(base*height)/2));
	}
}
