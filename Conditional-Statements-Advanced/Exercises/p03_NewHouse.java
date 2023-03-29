package Exercises;

import java.util.Scanner;

public class p03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double flowersPrice = 0.0;
        double total = 0.0;

        if (flowersType.equals("Roses")) {
            flowersPrice = 5.00;
            total = flowersCount * flowersPrice;
            if (flowersCount > 80) {
                total = total - total * 0.10;
            }
        } else if (flowersType.equals("Dahlias")) {
            flowersPrice = 3.80;
            total = flowersCount * flowersPrice;
            if (flowersCount > 90) {
                total = total - total * 0.15;
            }
        } else if (flowersType.equals("Tulips")) {
            flowersPrice = 2.80;
            total = flowersCount * flowersPrice;
            if (flowersCount > 80) {
                total = total - total * 0.15;
            }
        } else if (flowersType.equals("Narcissus")) {
            flowersPrice = 3.00;
            total = flowersCount * flowersPrice;
            if (flowersCount < 120) {
                total = total + total * 0.15;
            }
        } else if (flowersType.equals("Gladiolus")) {
            flowersPrice = 2.50;
            total = flowersCount * flowersPrice;
            if (flowersCount < 80) {
                total = total + total * 0.20;
            }
        }

        if (budget >= total) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowersCount, flowersType, (budget - total));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", total - budget);
        }
    }
}
