package fundamentals.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		
		List<String> products = new ArrayList<>();
		
		
		for (int i = 0; i < n ; i++) {
			String product = scanner.nextLine();
			products.add(product);
		}

		Collections.sort(products);
		
		int count = 1;
		for (String string : products) {
			System.out.println(count + "." + string);
			count++;
		}
	}

}
