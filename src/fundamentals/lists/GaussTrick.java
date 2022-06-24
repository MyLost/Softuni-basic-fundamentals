package fundamentals.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numbers =
			Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> gaussNumbers = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < numbers.size() / 2; i++) {
			sum = 0;
			sum = numbers.get(i) + numbers.get(numbers.size() - i -1);
			gaussNumbers.add(sum);
		}
		if(numbers.size() % 2 != 0) {
			int index = numbers.size() / 2;
			gaussNumbers.add(numbers.get(index));
		}
		for (Integer integer : gaussNumbers) {
			System.out.print(integer + " ");
		}
	}

}
