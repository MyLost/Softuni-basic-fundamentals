package basics.loop;

import java.util.Scanner;

public class PIN {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int firstNumUp = Integer.parseInt(scanner.nextLine());
	        int secondNumUp = Integer.parseInt(scanner.nextLine());
	        int thirdNumUp = Integer.parseInt(scanner.nextLine());

	        for (int i = 1; i <= firstNumUp; i++) {
	            for (int j = 1; j <= secondNumUp; j++) {
	                for (int k = 1; k <= thirdNumUp; k++) {
	                    if (true) {
	                        if (i % 2 == 0) {
	                            if (j == 2 || j == 3 || j == 5 || j == 7) {
	                                if (k % 2 == 0) {
	                                    System.out.println(i + " " + j + " " + k);
	                                }
	                            }
	 
	                        }
	 
	                    }
	 
	                }
	            }
	        }
	    }
}

