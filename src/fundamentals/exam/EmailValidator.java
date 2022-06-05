package fundamentals.exam;

import java.util.Scanner;

public class EmailValidator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String email = scanner.nextLine();

		String command = scanner.nextLine();

		while (!"Complete".equals(command)) {

			String[] commands = command.split("\\s+");
			if (commands[0].equals("Make") && commands[1].equals("Upper")) {
				System.out.println(email.toUpperCase());
			}
			if (commands[0].equals("Make") && commands[1].equals("Lower")) {
				System.out.println(email.toLowerCase());
			}
			if (commands[0].equals("GetDomain")) {
				System.out.println(email.substring(email.length() - Integer.parseInt(commands[1])));
			}
			if (commands[0].equals("GetUsername")) {
				if (email.indexOf("@") == -1) {
					System.out.println(String.format("The email %s doesn't contain the @ symbol.", email));
				} else {
					System.out.println(email.substring(0, email.indexOf("@")));
				}
			}
			if (commands[0].equals("Replace")) {
				System.out.println(email.replaceAll(commands[1], "-"));
			}
			if (commands[0].equals("Encrypt")) {
				for (int i = 0; i < email.length(); i++) {
					System.out.printf((int) email.charAt(i) + " ");
				}
			}
			command = scanner.nextLine();
		}
	}
}
