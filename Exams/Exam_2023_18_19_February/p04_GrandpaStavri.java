package Exam_2023_18_19_February;

import java.util.Scanner;

public class p04_GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        double totalDegrees = 0;
        double totalQuantity = 0;

        for (int i = 1; i <= daysCount; i++) {
            double drinkQuantity = Double.parseDouble(scanner.nextLine());
            double drinkDegree = Double.parseDouble(scanner.nextLine());

            double degreesPerLiter = drinkDegree * drinkQuantity;
            totalDegrees += degreesPerLiter;
            totalQuantity += drinkQuantity;
        }

        double averageDegrees = totalDegrees / totalQuantity;
        System.out.printf("Liter: %.2f%n", totalQuantity);
        System.out.printf("Degrees: %.2f%n", averageDegrees);
        if (averageDegrees < 38.00) {
            System.out.println("Not good, you should baking!");
        } else if (averageDegrees <= 42.00) {
            System.out.println("Super!");
        } else if (averageDegrees > 42.00) {
            System.out.println("Dilution with distilled water!");
        }
    }
}
