package fundamentals.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
//		int count=0;
//		int startIndex =0;
//		int endIndex = 	0;
//		boolean flagSame = false;
//		for (int i = 0; i < numbers.length; i++) {
//			count = 0;
//
//			for (int k = i+1; k < numbers.length; k++) {
//				if(numbers[i] == numbers[k]) {
//					count++;
//					if(k == numbers.length-1 && numbers[k-2] == numbers[k-1] && count+1 == numbers.length) {
//						flagSame = true;
//					}
//					if(numbers[numbers.length-1] == numbers[numbers.length-2] && k-1 == numbers.length-2) {
//						count++;
//					}
//				} else if(count > endIndex - startIndex) {
//						startIndex = i;
//						endIndex = k-1;
//				}
//				
//			}
//			if(flagSame) {
//				break;
//			}
//		}
//		if(flagSame) {
//			for (int i = 0; i < numbers.length; i++) {
//				System.out.print(numbers[i] + " ");
//			}
//		}
//		else {
//			for (int i = startIndex; i <= endIndex; i++) {
//				System.out.print(numbers[i] + " ");
//			}
//		}
		
        int[] array = Arrays
            .stream(scanner.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

	    int counter = 1;
	    int max = Integer.MIN_VALUE;
	    int currentElement = array[0];
	
	    for (int i = 1; i <= array.length - 1; i++) {
	
	        if (array[i] == array[i - 1]) {
	            counter++;
	
	            if (counter > max) {
	                max = counter;
	                currentElement = array[i];
	            }
	
	        } else {
	            counter = 1;
	        }
	
	    }
	    for (int i = 0; i < max ; i++) {
	        System.out.print(currentElement + " ");
	    }

	}

}


