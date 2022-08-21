package fundamentals.basics;

import java.util.Scanner;

public class Messages {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int readDigit = Integer.parseInt(scanner.nextLine());
		int cycles = readDigit;
		String text ="";
		for (int i = 0; i < cycles; i++) {
			readDigit = Integer.parseInt(scanner.nextLine());
			if(readDigit != 0) {
				int storeReadDigit = readDigit;
				int digitLenght = 0;
				while(true) {
					digitLenght++;
					readDigit = readDigit / 10;
					if(readDigit <= 0) {
						break;
					}
					
				}
				int mainDigit = storeReadDigit % 10;
				int offset = (mainDigit - 2) * 3;
				if(mainDigit == 8 || mainDigit == 9) {
					offset++;
				}
				int letterIndex = offset + digitLenght -1;
				letterIndex = letterIndex + 97;
				text += (char)letterIndex;
				digitLenght = 0;
			} else {
				text += (char)32;
			}
		}
		System.out.println(text);
	}

}
