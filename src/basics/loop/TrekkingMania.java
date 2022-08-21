package basics.loop;

import java.util.Scanner;

public class TrekkingMania {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int groupNumber = Integer.parseInt(scanner.nextLine());
		int allPeople =0;
		int[] arr = new int[groupNumber];
		for (int i = 0; i < groupNumber; i++) {
			int numberOfPeopleInGroup = Integer.parseInt(scanner.nextLine());
			allPeople += numberOfPeopleInGroup;
			arr[i]=numberOfPeopleInGroup;
		}
		
		int firstPeak = 0;
		int secondPeak = 0;
		int thirdPeak = 0; 
		int fourPeak = 0;
		int fivePeak = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <= 5) {
				firstPeak +=arr[i];
			} else if (arr[i] > 5 && arr[i] <= 12) {
				secondPeak +=arr[i];
			} else if (arr[i] >= 12 && arr[i] <= 25) {
				thirdPeak +=arr[i];
			} else if (arr[i] >=26 && arr[i] <= 40) {
				fourPeak +=arr[i];
			} else {
				fivePeak +=arr[i];
			}
		}
		System.out.println(String.format("%.2f%%",((double) firstPeak / (double)allPeople) * 100));
		System.out.println(String.format("%.2f%%",((double) secondPeak / (double)allPeople) * 100));
		System.out.println(String.format("%.2f%%",((double) thirdPeak / (double)allPeople) * 100));
		System.out.println(String.format("%.2f%%",((double) fourPeak / (double)allPeople) * 100));
		System.out.println(String.format("%.2f%%",((double) fivePeak / (double)allPeople) * 100));
		
	}
}
