package basics.checks;

import java.util.Scanner;

public class AreaOfFigures {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String shape = scanner.nextLine();
		
		if(shape.equals("square")) {
			double side = Double.parseDouble(scanner.nextLine());
			System.out.println(String.format("%.3f", side * side));
		} else if(shape.equals("rectangle")) {
			double width = Double.parseDouble(scanner.nextLine());
			double height = Double.parseDouble(scanner.nextLine());
			System.out.println(String.format("%.3f", width * height));
		} else if(shape.equals("circle")) {
			double radius = Double.parseDouble(scanner.nextLine());
			System.out.println(String.format("%.3f",radius * radius * Math.PI));
		} else {
			double side = Double.parseDouble(scanner.nextLine());
			double height = Double.parseDouble(scanner.nextLine());
			System.out.println(String.format("%.3f",  (side * height) / 2 ));
		}
	}
}
