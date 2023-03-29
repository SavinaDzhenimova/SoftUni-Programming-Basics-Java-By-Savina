package More_Exercises;

import java.util.Scanner;

public class p05_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double score = 0;
        double number1To9 = 0;
        double numbers10to19 = 0;
        double numbers20To29 = 0;
        double numbers30to39 = 0;
        double numbers40To50 = 0;
        double invalidNumbers = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                score += number * 0.20;
                number1To9++;
            } else if (number >= 10 && number <= 19) {
                score += number * 0.30;
                numbers10to19++;
            } else if (number >= 20 && number <= 29) {
                score += number * 0.40;
                numbers20To29++;
            } else if (number >= 30 && number <= 39) {
                score += 50;
                numbers30to39++;
            } else if (number >= 40 && number <= 50) {
                score += 100;
                numbers40To50++;
            } else {
                score = score / 2;
                invalidNumbers++;
            }
        }

        double percent1To9 = (number1To9 / n) * 100;
        double percent10To19 = (numbers10to19 / n) * 100;
        double percent20To29 = (numbers20To29 / n) * 100;
        double percent30To39 = (numbers30to39 / n) * 100;
        double percent40To50 = (numbers40To50 / n) * 100;
        double percentInvalidNumbers = (invalidNumbers / n) * 100;

        System.out.printf("%.2f%n", score);
        System.out.printf("From 0 to 9: %.2f%%%n", percent1To9);
        System.out.printf("From 10 to 19: %.2f%%%n", percent10To19);
        System.out.printf("From 20 to 29: %.2f%%%n", percent20To29);
        System.out.printf("From 30 to 39: %.2f%%%n", percent30To39);
        System.out.printf("From 40 to 50: %.2f%%%n", percent40To50);
        System.out.printf("Invalid numbers: %.2f%%%n", percentInvalidNumbers);
    }
}
