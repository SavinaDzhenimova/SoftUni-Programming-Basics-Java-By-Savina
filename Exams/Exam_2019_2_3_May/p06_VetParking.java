package Exam_2019_2_3_May;

import java.util.Scanner;

public class p06_VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalTax = 0;

        for (int d = 1; d <= days; d++) {
            double dailyTax = 0;
            double tax = 0;

            for (int h = 1; h <= hours; h++) {
                if (d % 2 == 0 && h % 2 != 0) {
                    tax = 2.50;
                } else if (d % 2 != 0 && h % 2 == 0) {
                    tax = 1.25;
                } else {
                    tax = 1.00;
                }
                dailyTax += tax;
            }
            System.out.printf("Day: %d - %.2f leva%n", d, dailyTax);
            totalTax += dailyTax;
        }
        System.out.printf("Total: %.2f leva%n", totalTax);
    }
}
