package More_Exercises;

import java.util.Scanner;

public class p04_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass = "";
        String carType = "";
        double carPrice = 0.0;

        if (season.equals("Summer")) {
            if (budget <= 100) {
                carClass = "Economy class";
                carType = "Cabrio";
                carPrice = budget * 0.35;
            } else if (budget > 100 && budget <= 500) {
                carClass = "Compact class";
                carType = "Cabrio";
                carPrice = budget * 0.45;
            } else if (budget > 500) {
                carClass = "Luxury class";
                carType = "Jeep";
                carPrice = budget * 0.90;
            }
        } else if (season.equals("Winter")) {
            if (budget <= 100) {
                carClass = "Economy class";
                carType = "Jeep";
                carPrice = budget * 0.65;
            } else if (budget > 100 && budget <= 500) {
                carClass = "Compact class";
                carType = "Jeep";
                carPrice = budget * 0.80;
            } else if (budget > 500) {
                carClass = "Luxury class";
                carType = "Jeep";
                carPrice = budget * 0.90;
            }
        }

        System.out.printf("%s%n", carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
