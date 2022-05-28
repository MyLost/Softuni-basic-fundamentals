package basics.loop;

import java.util.Scanner;

public class Cake {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cakeWidth = Integer.parseInt(scanner.nextLine());
		int cakelenght = Integer.parseInt(scanner.nextLine());
		
		int cakeSize = cakeWidth * cakelenght;

		String command = scanner.nextLine();
		
		while(!command.equals("STOP")) {
			cakeSize -= Integer.parseInt(command);
			if(cakeSize < 0) {
				System.out.println(String.format("No more cake left! You need %d pieces more.", Math.abs(cakeSize)));
				break;
			}
			command = scanner.nextLine();
		}
		if(cakeSize > 0) {
			System.out.println(String.format("%d pieces are left.", cakeSize));
		} 
	}
}
