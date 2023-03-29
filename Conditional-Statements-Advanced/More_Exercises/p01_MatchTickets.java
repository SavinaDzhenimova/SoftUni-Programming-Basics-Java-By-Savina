package More_Exercises;

import java.util.Scanner;

public class p01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());
        double transport = 0.0;
        double totalExpenses = 0.0;

        if (category.equals("VIP")) {
            if (peopleCount >= 1 && peopleCount <= 4) {
                transport = budget * 0.75;
            } else if (peopleCount >= 5 && peopleCount <= 9) {
                transport = budget * 0.60;
            } else if (peopleCount >= 10 && peopleCount <= 24) {
                transport = budget * 0.50;
            } else if (peopleCount >= 25 && peopleCount <= 49) {
                transport = budget * 0.40;
            } else if (peopleCount >= 50) {
                transport = budget * 0.25;
            }
            totalExpenses = peopleCount * 499.99 + transport;
        } else if (category.equals("Normal")) {
            if (peopleCount >= 1 && peopleCount <= 4) {
                transport = budget * 0.75;
            } else if (peopleCount >= 5 && peopleCount <= 9) {
                transport = budget * 0.60;
            } else if (peopleCount >= 10 && peopleCount <= 24) {
                transport = budget * 0.50;
            } else if (peopleCount >= 25 && peopleCount <= 49) {
                transport = budget * 0.40;
            } else if (peopleCount >= 50) {
                transport = budget * 0.25;
            }
            totalExpenses = peopleCount * 249.99 + transport;
        }

        if (budget >= totalExpenses) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalExpenses);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalExpenses - budget);
        }
    }
}
