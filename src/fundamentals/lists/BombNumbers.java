package fundamentals.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers =
			Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		List<Integer> bombAndPawer =
			Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		int counter = 0;
		
		counter = numbers.stream().filter(e -> e == bombAndPawer.get(0)).collect(Collectors.toList()).size();
		

		while(counter > 0) {
			counter = numbers.stream().filter(e -> e == bombAndPawer.get(0)).collect(Collectors.toList()).size();
			if(counter == 0) {
				break;
			}
			counter--;
			var bombIndex = numbers.indexOf(bombAndPawer.get(0));
			var leftIndex =  bombIndex - bombAndPawer.get(1) < 0 ? 0 : bombIndex - bombAndPawer.get(1);
			var rightIndex = bombIndex + bombAndPawer.get(1) > numbers.size() ?
					bombIndex + (numbers.size() - bombIndex -1)  : bombIndex + bombAndPawer.get(1);
			
			for (int i = leftIndex; i <= rightIndex ; i++) {
				numbers.remove(leftIndex);
			}
		}
		int sum = 0;
		for (Integer integer : numbers) {
			sum +=integer;
		}
			
		System.out.println(sum);
			
	}
}
