package fundamentals.dataTypesAndVariables;

import java.util.Iterator;
import java.util.Scanner;

public class WaterOverflow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int waterTank = 255;
		int numberOfLines = Integer.parseInt(scanner.nextLine());
		int allWaterPoured = 0;
		if(numberOfLines > 0 && numberOfLines <= 20) {
			for (int i = 0; i < numberOfLines; i++) {
				int waterForPour = Integer.parseInt(scanner.nextLine());
				if(waterForPour <= waterTank) {
					waterTank = waterTank - waterForPour;
					allWaterPoured += waterForPour;
				} else {
					System.out.println("Insufficient capacity!");
				}
	
			}
			System.out.println(allWaterPoured);
		}
	}
		
//		int n = Integer.parseInt(scanner.nextLine());
//		int tank = 0;
//		for (int i = 0; i < n; i++) {
//			int load = Integer.parseInt(scanner.nextLine());
//			if(tank + load > 255) {
//				System.out.println("Insufficient capacity!");
//				continue;
//			}
//			tank +=load;
//		}
//		System.out.println(tank);
//	}
}
