package basics.exam;

import java.util.Scanner;

public class MiningRig {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int videoCardPrice = Integer.parseInt(scanner.nextLine());
		int adapterPrice = Integer.parseInt(scanner.nextLine());
		double energiConsumptionDay = Double.parseDouble(scanner.nextLine());
		double videoCardProfit = Double.parseDouble(scanner.nextLine());
		
		int videoCardsPrice = videoCardPrice * 13;
		int adaptersPrice = adapterPrice * 13;
		
		
		int spendMoney = videoCardsPrice + adaptersPrice + 1000;
		
		double costForAllCards = energiConsumptionDay * 13;
		
		double profitForOneDay = (videoCardProfit * 13) - costForAllCards;
		
		System.out.println(spendMoney);
		System.out.println(String.format("%.0f", Math.ceil(spendMoney / profitForOneDay)));
	}
}
