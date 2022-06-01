package fundamentals.exam;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class DecryptingCommands {

	public static void main(String[] args) throws NumberFormatException, UnsupportedEncodingException {

		Scanner scanner = new Scanner(System.in);

		String text = scanner.nextLine();
		String command = scanner.nextLine();

		while (!"Finish".equals(command)) {

			String[] commands = command.split("\\s+");

			if (commands[0].equals("Replace")) {
				replace(commands[1], commands[2], text);
			}
			if (commands[0].equals("Cut")) {
				cut(Integer.parseInt(commands[1]) + 1, Integer.parseInt(commands[2]) + 2, text);
			}
			if (commands[0].equals("Make")) {
				make(commands[1], text);
			}
			if (commands[0].equals("Check")) {
				check(commands[1], text);
			}
			if (commands[0].equals("Sum")) {
				sum(Integer.parseInt(commands[1]) + 1, Integer.parseInt(commands[2]) + 2, text);
			}

			command = scanner.nextLine();
		}
	}

	public static void replace(String currentChar, String newChar, String text) {
		System.out.println(text.replace(currentChar, newChar));
	}

	public static void cut(int startIndex, int endIndex, String text) {
		if (startIndex < 0 || endIndex > text.length()) {
			System.out.println("Invalid indices!");
		} else {
			System.out.println(text.replace(text.substring(startIndex, endIndex), ""));
		}
	}

	public static void make(String action, String text) {
		if (action.equals("Upper")) {
			System.out.println(text.toUpperCase());
		}
		if (action.equals("Lower")) {
			System.out.println(text.toLowerCase());
		}
	}

	public static void check(String containedText, String text) {
		boolean isContainedText = text.contains(containedText);
		if (isContainedText) {
			System.out.println("Message contains " + containedText);
		} else {
			System.out.println("Message doesn't contain " + containedText);
		}
	}

	public static void sum(int startIndex, int endIndex, String text) throws UnsupportedEncodingException {
		if (startIndex < 0 || endIndex > text.length()) {
			System.out.println("Invalid indices!");
		} else {
			String substring = text.substring(startIndex, endIndex);
			int sum = 0;
			byte[] bytes = substring.getBytes("US-ASCII");
			for (byte element : bytes) {
				sum += element;
			}
			System.out.println(sum);
		}
	}
}
