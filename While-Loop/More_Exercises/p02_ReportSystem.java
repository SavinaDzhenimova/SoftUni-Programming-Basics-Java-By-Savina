package More_Exercises;

import java.util.Scanner;

public class p02_ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededSum = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int cashTransactions = 0;
        int cardTransactions = 0;
        int cashCount = 0;
        int cardCount = 0;
        int count = 0;

        while (!command.equals("End")) {
            count++;

            if (count % 2 == 0) {
                int cardAmount = Integer.parseInt(command);
                if (cardAmount < 10) {
                    System.out.println("Error in transaction!");
                    command = scanner.nextLine();
                    continue;
                }
                neededSum -= cardAmount;
                cardTransactions += cardAmount;
                cardCount++;
                System.out.println("Product sold!");
            } else {
                int cashAmount = Integer.parseInt(command);
                if (cashAmount > 100) {
                    System.out.println("Error in transaction!");
                    command = scanner.nextLine();
                    continue;
                }
                neededSum -= cashAmount;
                cashTransactions += cashAmount;
                cashCount++;
                System.out.println("Product sold!");
            }

            if (neededSum <= 0) {
                break;
            }
            command = scanner.nextLine();
        }

        if (neededSum <= 0) {
            double averageCash = cashTransactions * 1.00 / cashCount;
            System.out.printf("Average CS: %.2f%n", averageCash);
            double averageCard = cardTransactions * 1.00 / cardCount;
            System.out.printf("Average CC: %.2f%n", averageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
