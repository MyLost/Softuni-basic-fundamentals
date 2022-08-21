package fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		String commands = scanner.nextLine();
		
		int max = Integer.MIN_VALUE;
		int[] bestDNAArray = new int[n];
		int bestSum = 0;
		int currentSum = 0;
		int counter = 1;		
		int currentIndex = Integer.MAX_VALUE;
		int bestIndex = Integer.MAX_VALUE;
		int bestIndexOffset = 0;
		int SequenceTemp = 0;
		int bestSequence = 1;
		while(!commands.equals("Clone them!")) {
			counter = 1;
			currentSum = 0;
			int[] array = Arrays.stream(commands.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();

	 
			for (int i = 1; i < n; i++) {
				currentSum+=array[i-1];
				if(array[i] == 1) {
					if(array[i] == array[i-1]) {
						counter++;
						if(counter >= max) {
							bestIndexOffset++;
							max = counter;
							currentIndex = i - bestIndexOffset;
						}
					} else {
						counter=1;
						bestIndexOffset =0;
					}
				}
			}
			SequenceTemp++;
			if(array[array.length-1] == 1 && array.length != 1) {
				currentSum++;
				currentIndex++;
			} else {
				if(n == 1 && array[0] == 1 || n < array.length) {
					currentSum++;
				}
			}
			if(currentIndex < bestIndex || (currentIndex == bestIndex && currentSum > bestSum) ||  
				(currentIndex > bestIndex && currentSum > bestSum) ||
				currentIndex == bestIndex && SequenceTemp == bestSequence && currentSum > bestSum
				) {
				bestIndex = currentIndex;
				bestDNAArray = array;
				bestSum = currentSum;
				bestSequence = SequenceTemp;
			}  
			commands = scanner.nextLine();
		}
		System.out.println(String.format("Best DNA sample %d with sum: %d.", bestSequence, bestSum));
		for(int i : bestDNAArray) {
			System.out.print(i + " ");
		}
	}
}