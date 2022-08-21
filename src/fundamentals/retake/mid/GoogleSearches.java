package fundamentals.retake.mid;

import java.util.Scanner;

public class GoogleSearches {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float moneyForOneSearch = Float.parseFloat(scanner.nextLine());
		int users = Integer.parseInt(scanner.nextLine());

		float totalMoney = 0f;
		for (int i = 1; i <= users; i++) {

			if (users > 10000 || moneyForOneSearch > 5000.00) {
				break;
			}

			int searches = Integer.parseInt(scanner.nextLine());

			if (searches == 1) {
				continue;
			} else {
				if (searches > 5) {
					float earnedMoney = moneyForOneSearch * searches;
					totalMoney += earnedMoney * 2.0;
				}

				if (i % 3 == 0 && searches != 1) {
					float earnedMoney = moneyForOneSearch * searches;
					totalMoney += earnedMoney * 3.0;
					if (searches > 5) {
						earnedMoney = moneyForOneSearch * searches;
						totalMoney += earnedMoney * 2.0;
					}
				}
			}
		}
		System.out.println(String.format("Total money earned: %.2f", totalMoney));
	}
}
