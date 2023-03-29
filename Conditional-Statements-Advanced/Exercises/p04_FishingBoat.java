package Exercises;

import java.util.Scanner;

public class p04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());
        double rent = 0.0;

        if (season.equals("Spring")) {
            rent = 3000;
            if (fishersCount <= 6) {
                rent = rent - rent * 0.10;
            } else if (fishersCount <= 11) {
                rent = rent - rent * 0.15;
            } else if (fishersCount >= 12) {
                rent = rent - rent * 0.25;
            }

            if (fishersCount % 2 == 0) {
                rent = rent - rent * 0.05;
            }
        } else if (season.equals("Summer")) {
            rent = 4200;
            if (fishersCount <= 6) {
                rent = rent - rent * 0.10;
            } else if (fishersCount <= 11) {
                rent = rent - rent * 0.15;
            } else if (fishersCount >= 12) {
                rent = rent - rent * 0.25;
            }

            if (fishersCount % 2 == 0) {
                rent = rent - rent * 0.05;
            }
        } else if (season.equals("Autumn")) {
            rent = 4200;
            if (fishersCount <= 6) {
                rent = rent - rent * 0.10;
            } else if (fishersCount <= 11) {
                rent = rent - rent * 0.15;
            } else if (fishersCount >= 12) {
                rent = rent - rent * 0.25;
            }
        } else if (season.equals("Winter")) {
            rent = 2600;
            if (fishersCount <= 6) {
                rent = rent - rent * 0.10;
            } else if (fishersCount <= 11) {
                rent = rent - rent * 0.15;
            } else if (fishersCount >= 12) {
                rent = rent - rent * 0.25;
            }

            if (fishersCount % 2 == 0) {
                rent = rent - rent * 0.05;
            }
        }

        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }
    }
}
