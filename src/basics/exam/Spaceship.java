package basics.exam;

import java.util.Scanner;

public class Spaceship {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double spaceshipWidth = Double.parseDouble(scanner.nextLine());
		double spaceshipLenght = Double.parseDouble(scanner.nextLine());
		double spaceshipHeight = Double.parseDouble(scanner.nextLine());
		double averageAstronautHeight = Double.parseDouble(scanner.nextLine());
		
		double spaceshipVolume = spaceshipWidth * spaceshipLenght * spaceshipHeight;
		double spaceshipRoomVolume = 2 * 2 * (averageAstronautHeight + 0.40);
		double astronautNumber =  Math.floor(spaceshipVolume / spaceshipRoomVolume);
		
		if(astronautNumber >= 3 && astronautNumber < 10) {
			System.out.println(String.format("The spacecraft holds %.0f astronauts.", astronautNumber));

		} else if (astronautNumber < 3) {
			System.out.println("The spacecraft is too small.");
		} else {
			System.out.println("The spacecraft is too big.");
		}
	}
}
