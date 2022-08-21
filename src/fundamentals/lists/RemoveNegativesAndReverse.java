package fundamentals.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers =
			Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		List<Integer> positiveAndReversedNumbers = numbers.stream().filter(elem -> elem >= 0).collect(Collectors.toList());
		
		Collections.reverse(positiveAndReversedNumbers);
		
		if(!positiveAndReversedNumbers.isEmpty()) {
			for (Integer integer : positiveAndReversedNumbers) {
				System.out.print(integer + " ");
			}
		} else {
			System.out.println("empty");
		}

	}

}
