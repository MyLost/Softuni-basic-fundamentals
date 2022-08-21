package fundamentals.exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageEncrypter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		String regex = "(\\*|\\@)(?<messageOne>[A-Z]{1})(?<messageTwo>[a-z]{2,})(\\1):\\s{1}\\[(?<first>[A-Za-z0-9])\\]\\|\\[(?<second>[A-Za-z])\\]\\|\\[(?<third>[A-Za-z])\\]\\|$";
		Pattern pattern = Pattern.compile(regex);

		for (int i = 0; i < n; i++) {
			String message = scanner.nextLine();
			Matcher matcher = pattern.matcher(message);

			if (matcher.find()) {
				int first = matcher.group("first").charAt(0);
				int second = matcher.group("second").charAt(0);
				int third = matcher.group("third").charAt(0);
				String msg = matcher.group("messageOne") + matcher.group("messageTwo");
				System.out.println(String.format("%s: %d %d %d", msg, first, second, third));
			} else {
				System.out.println("Valid message not found!");
			}
		}
	}
}
