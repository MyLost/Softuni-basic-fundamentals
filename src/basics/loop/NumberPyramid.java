package basics.loop;
import java.util.Scanner;
public class NumberPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int counter = 1;
		for (int i=0; i < n; i++) {
			for (int j=1; j<=i+1; j++) {
				if(counter > n) {
					break;
				}
				System.out.printf("%d ",counter);
				counter++;
			}
			System.out.println();
		}
		scanner.close();
	}
}



