package fundamentals.retake.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(
			Collectors.toList());

		int count = 0;
		int sum = 0;
		for (int i : numbers) {
			count++;
			sum += i;
		}

		int avarage = sum / count;
		Collections.sort(numbers);
		Collections.reverse(numbers);

		List<Integer> result = new ArrayList<>();
		var index = 0;
		for (int i : numbers) {
			if (avarage < 0) {
				if (i > avarage && index < 5) {
					result.add(i);
					index++;
				}
			} else {
				if (i > avarage && index < 5) {
					result.add(i);
					index++;
				}
			}
		}

		if (result.isEmpty()) {
			System.out.println("No");

		} else {
			result.forEach(item -> System.out.print(item + " "));
		}
	}
}
