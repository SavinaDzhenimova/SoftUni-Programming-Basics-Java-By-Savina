package Exercises;

import java.util.Scanner;

public class p05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String holidayType = "";

        if (season.equals("summer")) {
            if (budget <= 100) {
                destination = "Bulgaria";
                holidayType = "Camp";
                budget = budget * 0.30;
            } else if (budget <= 1000) {
                destination = "Balkans";
                holidayType = "Camp";
                budget = budget * 0.40;
            } else if (budget > 1000) {
                destination = "Europe";
                holidayType = "Hotel";
                budget = budget * 0.90;
            }
        } else if (season.equals("winter")) {
            if (budget <= 100) {
                destination = "Bulgaria";
                holidayType = "Hotel";
                budget = budget * 0.70;
            } else if (budget <= 1000) {
                destination = "Balkans";
                holidayType = "Hotel";
                budget = budget * 0.80;
            } else if (budget > 1000) {
                destination = "Europe";
                holidayType = "Hotel";
                budget = budget * 0.90;
            }
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", holidayType, budget);
    }
}
