package basics.loop;

import java.util.Scanner;

public class Vacation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double money = Double.parseDouble(scanner.nextLine());
		double availableMoney = Double.parseDouble(scanner.nextLine());
		
		int daysSpendMoney = 0;
		int allDays = 0;
		
		while(availableMoney < money && daysSpendMoney < 5) {
			allDays++;
			String action = scanner.nextLine();
			double actionMoney = Double.parseDouble(scanner.nextLine());
			
			if(action.equals("spend")) {
				daysSpendMoney++;
				availableMoney -=actionMoney;
				if(availableMoney < 0) {
					availableMoney = 0;
				}
			} else if(action.equals("save")){
				daysSpendMoney = 0;
				availableMoney += actionMoney;
			}
		}
		if(daysSpendMoney == 5) {
			System.out.println(String.format("You can't save the money. \n%d", allDays));
		}
		if(availableMoney >= money) {
			System.out.println(String.format("You saved the money for %d days.", allDays));
		}
		scanner.close();
	}
}
