package basics.loop;

import java.util.Scanner;

public class Building {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int flourNumbers = Integer.parseInt(scanner.nextLine());
		int roomNumbers = Integer.parseInt(scanner.nextLine());
		
		for (int i = flourNumbers; i >=1 ; i--) {
			for (int j = 0; j < roomNumbers ; j++) {
				if(flourNumbers == 1 || flourNumbers == i) {
					System.out.printf(String.format("L%d%d ", i,j));
				}
				if(flourNumbers != 1 && flourNumbers != i) {
					if(i % 2 !=0) {
						System.out.printf(String.format("A%d%d ", i,j));
					} else {
						System.out.printf(String.format("O%d%d ", i,j));
					}
				}
			}
			System.out.println();
		}
	}
}