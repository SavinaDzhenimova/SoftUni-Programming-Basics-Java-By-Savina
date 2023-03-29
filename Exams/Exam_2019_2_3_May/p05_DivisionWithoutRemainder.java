package Exam_2019_2_3_May;

import java.util.Scanner;

public class p05_DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int numberDividedBy2 = 0;
        int numberDividedBy3 = 0;
        int numberDividedBy4 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 ==0) {
                numberDividedBy2++;
            }
            if (number % 3 ==0) {
                numberDividedBy3++;
            }
            if (number % 4 == 0) {
                numberDividedBy4++;
            }
        }

        double percent2 = (numberDividedBy2 * 1.00 / n) * 100;
        double percent3 = (numberDividedBy3 * 1.00 / n) * 100;
        double percent4 = (numberDividedBy4 * 1.00 / n) * 100;

        System.out.printf("%.2f%%%n", percent2);
        System.out.printf("%.2f%%%n", percent3);
        System.out.printf("%.2f%%%n", percent4);
    }
}
