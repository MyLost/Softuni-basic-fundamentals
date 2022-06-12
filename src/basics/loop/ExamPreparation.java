package basics.loop;

import java.util.Scanner;

public class ExamPreparation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double score = 0;
		int numberOfTask = 0;
		int inadequateResult = 0;
		String lastTaskName = "";
		int numberOfInadequateEstimates = Integer.parseInt(scanner.nextLine());
		String nameOfTask = scanner.nextLine();
		while(!nameOfTask.equals("Enough")) {
			numberOfTask++;
			int estimateTask = Integer.parseInt(scanner.nextLine());
			score = score + estimateTask;
			if(estimateTask <= 4) {
				inadequateResult++;
			}
			lastTaskName = nameOfTask;
			
			if(inadequateResult >= numberOfInadequateEstimates) {
				System.out.println(String.format("You need a break, %d poor grades.", inadequateResult));
				break;
			}
			nameOfTask = scanner.nextLine();
			
		}
		if(inadequateResult < numberOfInadequateEstimates) {
		System.out.println(String.format("Average score: %.2f", score / numberOfTask));
		System.out.println(String.format("Number of problems: %d", numberOfTask));
		System.out.println(String.format("Last problem: %s", lastTaskName));
		}
	}
}
