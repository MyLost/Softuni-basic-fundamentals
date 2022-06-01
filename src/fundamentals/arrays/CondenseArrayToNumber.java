package fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		int condensed[] = new int[array.length-1];
		if(array.length - 1 != 0) {
			while(true) {
				for (int i = 0; i < array.length -1; i++) {
					condensed[i] = array[i] + array[i+1];
				}
				if(condensed.length-1 == 0) {
					break;
				}
				array = condensed;
				condensed = new int[array.length-1];
			}
			System.out.println(condensed[0]);
		} else {
			System.out.println(array[0]);
		}
	}

}
