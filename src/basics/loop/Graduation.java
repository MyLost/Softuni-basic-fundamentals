package basics.loop;

import java.util.Scanner;
 
public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String name = scanner.nextLine();
        int flunk = 0;
        double score = 0.0;
        int klass = 0;
 
        while (klass != 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                flunk++;
            }
            if (flunk > 1) {
                System.out.printf("%s has been excluded at %d grade", name, klass);
                break;
            } else {
                score += grade;
                klass++;
            }
        }
 
        if (flunk < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, score / klass);
        }
 
 
    }
}
 
