package fundamentals.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String keyRegex = "[STARstar]";
		Pattern keyPattern = Pattern.compile(keyRegex);

		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < n; i++) {
			String message = scanner.nextLine();
			Matcher keyMatcher = keyPattern.matcher(message);
			int count = 0;
			while (keyMatcher.find()) {
				count++;
			}
			StringBuilder sb = new StringBuilder(message);

			for (int j = 0; j < sb.length(); j++) {
				int newChar = sb.charAt(j) - count;
				sb.setCharAt(j, (char) newChar);
			}
			System.out.println(sb.toString());
		}
	}
}
