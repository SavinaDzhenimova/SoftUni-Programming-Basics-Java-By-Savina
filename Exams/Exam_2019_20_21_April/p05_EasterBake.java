package Exam_2019_20_21_April;

import java.util.Scanner;

public class p05_EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sugarPackets = 0;
        double flourPackets = 0;
        int maxSugar = 0;
        int maxFlour = 0;
        int totalSugar = 0;
        int totalFlour = 0;

        for (int i = 1; i <= n; i++) {
            int sugarGrams = Integer.parseInt(scanner.nextLine());
            int flourGrams = Integer.parseInt(scanner.nextLine());

            if (sugarGrams > maxSugar) {
                maxSugar = sugarGrams;
            }

            if (flourGrams > maxFlour) {
                maxFlour = flourGrams;
            }

            totalSugar += sugarGrams;
            totalFlour += flourGrams;

            sugarPackets = Math.ceil(totalSugar / 950.00);
            flourPackets = Math.ceil(totalFlour / 750.00);
        }

        System.out.printf("Sugar: %.0f%n", sugarPackets);
        System.out.printf("Flour: %.0f%n", flourPackets);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
