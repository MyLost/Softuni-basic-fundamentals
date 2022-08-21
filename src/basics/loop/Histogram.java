package basics.loop;

import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int p4 = 0;
		int p5 = 0;
		int allNumbers = 0;
		for (int i = 0; i < n; i++) {
			Integer number = Integer.parseInt(scanner.nextLine());
			allNumbers++;
			if(number < 200) {
				p1++;
			}else if(number >= 200 && number < 400) {
				p2++;
			}else if (number >= 400 && number < 600) {
				p3++;
			}else if (number >= 600 && number < 800) {
				p4++;
			} else {
				p5++;
			}
		}
		System.out.println(String.format("%.2f%%",(double)p1/(double)allNumbers*100));
		System.out.println(String.format("%.2f%%",(double)p2/(double)allNumbers*100));
		System.out.println(String.format("%.2f%%",(double)p3/(double)allNumbers*100));
		System.out.println(String.format("%.2f%%",(double)p4/(double)allNumbers*100));
		System.out.println(String.format("%.2f%%",(double)p5/(double)allNumbers*100));
	}
}
