package basics.checks;

import java.util.Scanner;

public class WorldSwimmingRecord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double worldRecord = Double.parseDouble(scanner.nextLine());
		double distanceInMeters = Double.parseDouble(scanner.nextLine());
		double timeInSecondsForOneMeter = Double.parseDouble(scanner.nextLine());
		
		double totalSeconds = distanceInMeters * timeInSecondsForOneMeter;
		int delay = (int) Math.floor(distanceInMeters / 15);
		double delaySeconds = delay * 12.5;
		totalSeconds = totalSeconds + delaySeconds;
		if(totalSeconds < worldRecord) {
			System.out.println(String.format("Yes, he succeeded! The new world record is %.2f seconds.", totalSeconds));
		}else {
			System.out.println(String.format("No, he failed! He was %.2f seconds slower.", totalSeconds - worldRecord));
		}
	}
}
