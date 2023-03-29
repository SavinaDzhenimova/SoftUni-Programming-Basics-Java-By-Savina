package Exercises;

import java.util.Scanner;

public class p09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String grade = scanner.nextLine();
        double price = 0.0;

        if (roomType.equals("room for one person")) {
            price = (days - 1) * 18.00;
        } else if (roomType.equals("apartment")) {
            price = (days - 1) * 25.00;
            if (days < 10) {
                price = price * 0.70;
            } else if (days <= 15) {
                price = price * 0.65;
            } else if (days > 15) {
                price = price * 0.50;
            }
        } else if (roomType.equals("president apartment")) {
            price = (days - 1) * 35.00;
            if (days < 10) {
                price = price * 0.90;
            } else if (days <= 15) {
                price = price * 0.85;
            } else if (days > 15) {
                price = price * 0.80;
            }
        }

        if (grade.equals("positive")) {
            price = price + price * 0.25;
        } else if (grade.equals("negative")) {
            price = price - price * 0.10;
        }

        System.out.printf("%.2f", price);
    }
}
