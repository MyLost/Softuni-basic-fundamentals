package fundamentals.retake.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		String regex = "([=\\\\/]{1})([A-Z][A-Za-z]{2,})\\1";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(input);

		List<String> destinations = new ArrayList<>();

		while (matcher.find()) {
			destinations.add(matcher.group(2));
		}

		String finalDestinations = String.join(", ", destinations);
		int points = 0;
		for (String dst : destinations) {
			points += dst.length();
		}

		System.out.printf("Destinations: %s", finalDestinations);
		System.out.println();
		System.out.printf("Travel Points: %d", points);
	}

}
