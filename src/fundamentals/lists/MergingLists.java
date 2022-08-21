package fundamentals.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		List<Integer> listOne =
			Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		List<Integer> listTwo =
			Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		List<Integer> mergedList = new ArrayList<>();
		
		boolean listOneIsBigger = false;
		boolean listTwoIsBigger = false;
		
		int counter = 0;
		if(listOne.size() > listTwo.size()) {
			counter = listTwo.size();
			listOneIsBigger = true;
		} else if (listOne.size() < listTwo.size()){
			counter = listOne.size();
			listTwoIsBigger = true;
		} else {
			counter = listTwo.size();
		}
		
		for (int i = 0; i < counter; i++) {
			mergedList.add(listOne.get(i));
			mergedList.add(listTwo.get(i));
		}
		
		if(listOneIsBigger) {
			for (int i = listTwo.size(); i < listOne.size(); i++) {
				mergedList.add(listOne.get(i));
			}
		}
		
		if(listTwoIsBigger) {
			for (int i = listOne.size(); i < listTwo.size(); i++) {
				mergedList.add(listTwo.get(i));
			}
		}
		for (Integer integer : mergedList) {
			System.out.print(integer + " ");
		}
	}

}
