package Exam_2020_28_29_March;

import java.util.Scanner;

public class p03_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String setSize = scanner.nextLine();
        int numberOfSets = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        int number = 0;

        switch (setSize) {
            case "small":
                number = 2;
                switch (fruit) {
                    case "Watermelon":
                        price = 56.00;
                        break;
                    case "Mango":
                        price = 36.66;
                        break;
                    case "Pineapple":
                        price = 42.10;
                        break;
                    case "Raspberry":
                        price = 20.00;
                        break;
                }
                break;
            case "big":
                number = 5;
                switch (fruit) {
                    case "Watermelon":
                        price = 28.70;
                        break;
                    case "Mango":
                        price = 19.60;
                        break;
                    case "Pineapple":
                        price = 24.80;
                        break;
                    case "Raspberry":
                        price = 15.20;
                        break;
                }
                break;
        }

        double totalPrice = price * number * numberOfSets;

        if (totalPrice >= 400 && totalPrice <= 1000) {
            totalPrice = totalPrice * 0.85;
        } else if (totalPrice > 1000) {
            totalPrice = totalPrice * 0.50;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
