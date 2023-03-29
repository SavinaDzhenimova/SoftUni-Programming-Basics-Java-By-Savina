package More_Exercises;

import java.util.Scanner;

public class p04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double excellent = 0;
        double veryGood = 0;
        double good = 0;
        double fail = 0;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 2.00 && grade < 3.00) {
                fail++;
            } else if (grade <= 3.99) {
                good++;
            } else if (grade <= 4.99) {
                veryGood++;
            } else if (grade <= 6.00) {
                excellent++;
            }
            sum += grade;
        }

        double average = sum / n;
        double percentFail = (fail / n) * 100;
        double percentGood = (good / n) * 100;
        double percentVeryGood = (veryGood / n) * 100;
        double percentExcellent = (excellent / n) * 100;

        System.out.printf("Top students: %.2f%%%n", percentExcellent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentVeryGood);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentGood);
        System.out.printf("Fail: %.2f%%%n", percentFail);
        System.out.printf("Average: %.2f", average);
    }
}
