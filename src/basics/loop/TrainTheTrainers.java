package basics.loop;

import java.util.Scanner;

public class TrainTheTrainers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		String presentationName = scanner.nextLine();
		int lenght =0;
		double averageEstimate =0d;
		double estimatesSum =0;
		double allPresentationAverageEstimate = 0;
		int presentationLenght = 0;
		while(!presentationName.equals("Finish")) {
			for (int i = 0; i < n; i++) {
				double estimate = Double.parseDouble(scanner.nextLine());
				estimatesSum += estimate;
				lenght++;
			}
			averageEstimate = estimatesSum / lenght;
			allPresentationAverageEstimate +=averageEstimate;
			presentationLenght++;
			System.out.println(String.format( "%s - %.2f.", presentationName, averageEstimate));
			averageEstimate = 0;
			estimatesSum = 0;
			lenght = 0;
			presentationName = scanner.nextLine();
		}
		
		System.out.println(String.format("Student's final assessment is %.2f.", allPresentationAverageEstimate / presentationLenght));
		scanner.close();
	}
}
