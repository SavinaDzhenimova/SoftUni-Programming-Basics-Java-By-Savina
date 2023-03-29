package Exam_2020_28_29_March;

import java.util.Scanner;

public class p03_FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0.0;

        if (gender.equals("m")) {
            if (sport.equals("Gym")) {
                price = 42.00;
            } else if (sport.equals("Boxing")) {
                price = 41.00;
            } else if (sport.equals("Yoga")) {
                price = 45.00;
            } else if (sport.equals("Zumba")) {
                price = 34.00;
            } else if (sport.equals("Dances")) {
                price = 51.00;
            } else if (sport.equals("Pilates")) {
                price = 39.00;
            }
        } else if (gender.equals("f")) {
            if (sport.equals("Gym")) {
                price = 35.00;
            } else if (sport.equals("Boxing")) {
                price = 37.00;
            } else if (sport.equals("Yoga")) {
                price = 42.00;
            } else if (sport.equals("Zumba")) {
                price = 31.00;
            } else if (sport.equals("Dances")) {
                price = 53.00;
            } else if (sport.equals("Pilates")) {
                price = 37.00;
            }
        }

        if (age <= 19) {
            price = price * 0.80;
        }

        if (sum >= price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - sum);
        }
    }
}
