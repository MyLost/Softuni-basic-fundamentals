package basics.checks;

import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double width = Double.parseDouble(scanner.nextLine());
		double length =  Double.parseDouble(scanner.nextLine());
		double height = Double.parseDouble(scanner.nextLine());
		
		double fronatWallArea = width * width; 
		double backWallArea = width * width;
		double door = 1.2 * 2;
		fronatWallArea = fronatWallArea - door;
		double leftSideArea = width * length;
		double rightSideArea = width * length;
		double window = 1.5 * 1.5;
		leftSideArea = leftSideArea - window;
		rightSideArea = rightSideArea - window;
		
		double houseArea = fronatWallArea + backWallArea + leftSideArea + rightSideArea;
		
		double frontSideRoof= width * height / 2;
		double backSideRoof = width * height / 2;
		double leftSideRoof = width * length; 
		double rightSideRoof = width * length;
 		
		double roofArea = frontSideRoof + backSideRoof + leftSideRoof + rightSideRoof;
		
		double greenPaint = houseArea / 3.4;
		double redPaint = roofArea / 4.3;
		
		System.out.println(String.format("%.2f", greenPaint));
		System.out.println(String.format("%.2f", redPaint));
	}
}
