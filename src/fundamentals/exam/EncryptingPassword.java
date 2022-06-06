package fundamentals.exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Wrong regex!!!
public class EncryptingPassword {

	public static void main(String[] args) {
// ^(.*)>(?<numbers>[0-9]+)|(?<lcase>[a-z]+)|(?<ucase>[A-Z]+)|(?<symbols>[^.<>]+)<\1$
		Pattern pattern = Pattern.compile(
			"(.+)>(?<secondGroup>\\d{3})\\|(?<thirdGroup>[a-z]{3})\\|(?<fiveGroup>[A-Z]{3})\\|(?<sixGroup>[^<>\\w\\d]{3})<(.+)");

// String textRegex =
// "^(.*)>(?<numbers>[0-9]+)\\|(?<lcase>[a-z]+)\\|(?<ucase>[A-Z]+)\\|(?<symbols>[^.<>]+)<\\1$";
// StringBuilder password = new StringBuilder(scanner.nextLine());

		Scanner scanner = new Scanner(System.in);
		int lineNumbers = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < lineNumbers; i++) {
			String password = scanner.nextLine();
			Matcher matcher = pattern.matcher(password);
			boolean foundMatch = matcher.find();

			if (foundMatch && matcher.group(1).equals(matcher.group(6))) {
				var encryptedPassword = matcher.group("secondGroup") + matcher.group("thirdGroup") + matcher.group(
					"fiveGroup") + matcher.group("sixGroup");
				System.out.println("Password: " + encryptedPassword);
			} else {
				System.out.println("Try another password!");
			}
		}
	}
}
