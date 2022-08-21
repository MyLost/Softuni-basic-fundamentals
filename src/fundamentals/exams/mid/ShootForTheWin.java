package fundamentals.exams.mid;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		String command = scanner.nextLine();
		int successShots = 0;
		while(!"End".equals(command)) {
			
			int shotIndex = Integer.parseInt(command);
			
			if(shotIndex >=0 && shotIndex < numbers.length) {
				int value = numbers[shotIndex];
				numbers[shotIndex] = -1;
				successShots++;
				for (int i=0; i < numbers.length; i++) {
					if(numbers[i] == -1) {
						continue;
					} else if(numbers[i] > value) {
						numbers[i] = numbers[i] - value; 
					} else {
						numbers[i] = numbers[i] + value;
					}
				}
			}
			command = scanner.nextLine();
		}
		System.out.print("Shot targets: " + successShots + " -> ");
		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}
}
