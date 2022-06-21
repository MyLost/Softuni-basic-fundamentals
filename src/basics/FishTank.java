package basics;

import java.util.Scanner;

public class FishTank {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int lenght = Integer.parseInt(scanner.nextLine());
		int width = Integer.parseInt(scanner.nextLine());
		int hegiht = Integer.parseInt(scanner.nextLine());
		double percentige = Double.parseDouble(scanner.nextLine());
		
		double volume = lenght * width * hegiht;
		double volumeInLiters = volume / 1000 ;
		double occupiedSpace = volumeInLiters - (volumeInLiters*(percentige/100));
		
		System.out.println(occupiedSpace);

	}
}
