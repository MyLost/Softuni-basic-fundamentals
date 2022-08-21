package fundamentals.lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Double> numbers = 
			Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
		
		List<Double> sumAdjacentEqualNumbers = new ArrayList<>();
		
		extracted(numbers);
		
		String output = joinElementsByDelimeter(numbers, " "); 
		System.out.println(output);
	}

	private static void extracted(List<Double> numbers) {
		int i = 0;
		while (i < numbers.size()) {
			if(i < numbers.size()-1 && numbers.get(i).equals(numbers.get(i+1))) {
				numbers.set(i, numbers.get(i) + numbers.get(i+ 1));
				numbers.remove(i+1);
				i=-1;
			} 
			i++;
		}
	}

	private static String joinElementsByDelimeter(List<Double> numbers, String delimeter) {
		String output = "";
		for(Double item: numbers) {
			output += (new DecimalFormat("0.#").format(item) + delimeter);
		}
		return output;
	}
}
