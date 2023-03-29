package Exercises;

import java.util.Scanner;

public class p04_ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int teddyBears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        int toysCount = puzzles + dolls + teddyBears + minions + trucks;
        double totalSum = puzzles * 2.6 + dolls * 3 + teddyBears * 4.1 + minions * 8.2 + trucks * 2;
        double discount = totalSum * 0.25;
        double totalPrice;

        if (toysCount >= 50) {
            totalPrice = totalSum - discount;
        } else {
            totalPrice = totalSum;
        }

        double rent = totalPrice * 0.1;
        double profit = totalPrice - rent;
        double remainder = profit - excursionPrice;

        if (profit >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", remainder);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(remainder));
        }
    }
}
