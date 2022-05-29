package basics.loop;

import java.util.Scanner;

public class CharacterSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String sequence = scanner.nextLine();
		
		for (int i = 0; i < sequence.length(); i++) {
			System.out.println(sequence.charAt(i));
		}
	}
}
