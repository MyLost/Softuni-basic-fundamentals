package basics.loop;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int sequence = 1;
		while(sequence <= n) {
			System.out.println(sequence);
			sequence = sequence * 2 + 1;
		}
		scanner.close();
	}
}
