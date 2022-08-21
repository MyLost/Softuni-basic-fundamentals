package basics.loop;

import java.util.Scanner;

public class Moving {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int spaceWidth = Integer.parseInt(scanner.nextLine());
		int spaceLenght = Integer.parseInt(scanner.nextLine());
		int spaceHeight = Integer.parseInt(scanner.nextLine());
		
		int volume = spaceHeight * spaceLenght * spaceWidth;
		
		String command = scanner.nextLine();
		
		while(!command.equals("Done")) {
			volume = volume - Integer.parseInt(command);
			if(volume < 0) {
				System.out.println(String.format("No more free space! You need %d Cubic meters more.", Math.abs(volume)));
				break;
			}
			command = scanner.nextLine();
		}
		if(volume > 0) {
			System.out.println(String.format("%d Cubic meters left.", volume));
		}
	}
}
