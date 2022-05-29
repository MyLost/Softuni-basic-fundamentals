package basics.loop;

import java.util.Scanner;

public class CinemaTickets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();
		int purchasedТickets = 0;
		double fullnest = 0;
		int studentTickets = 0;
		int standartTickets = 0;
		int kidsTickets = 0;
		while(!command.equals("Finish")) {
			String movieName = command;
			int freeSeats = Integer.parseInt(scanner.nextLine());
			while(!command.equals("End") && !command.equals("Finish")) {
				command = scanner.nextLine();
				 if (purchasedТickets >= freeSeats) {
	                    break;
	                }
				if(command.equals("student")) {
					studentTickets++;
					purchasedТickets++;
				} else if (command.equals("standard")) {
					standartTickets++;
					purchasedТickets++;
				} else if (command.equals("kid")){
					kidsTickets++;
					purchasedТickets++;
				}
			}
			fullnest = (double)purchasedТickets / (double)freeSeats;
			System.out.println(String.format("%s - %.2f%% full.", movieName, fullnest * 100));
			purchasedТickets = 0;
			fullnest = 0;
			if(command.equals("End")) {
				command = scanner.nextLine();
			}
		}
		int totalTickets = studentTickets + standartTickets + kidsTickets;
		System.out.println(String.format("Total tickets: %d", totalTickets));
		System.out.println(String.format("%.2f%% student tickets.", (double)studentTickets / (double)totalTickets * 100));
		System.out.println(String.format("%.2f%% standard tickets.", (double)standartTickets / (double)totalTickets * 100));
		System.out.println(String.format("%.2f%% kids tickets.", (double)kidsTickets / (double)totalTickets * 100));
		scanner.close();
	}
}
