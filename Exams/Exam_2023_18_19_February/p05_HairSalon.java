package Exam_2023_18_19_February;

import java.util.Scanner;

public class p05_HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        double profit = 0;
        double price = 0;

        while (profit < target) {
            String command = scanner.nextLine();
            if (command.equals("closed")) {
                break;
            }
            String type = scanner.nextLine();

            if (command.equals("haircut")) {
                switch (type) {
                    case "mens":
                        price = 15.00;
                        break;
                    case "ladies":
                        price = 20.00;
                        break;
                    case "kids":
                        price = 10.00;
                        break;
                }
            } else if (command.equals("color")) {
                switch (type) {
                    case "touch up":
                        price = 20.00;
                        break;
                    case "full color":
                        price = 30.00;
                        break;
                }
            }
            profit += price;
        }

        if (profit >= target) {
            System.out.println("You have reached your target for the day!");
        } else {
            System.out.printf("Target not reached! You need %.0flv. more.%n", target - profit);
        }
        System.out.printf("Earned money: %.0flv.%n", profit);
    }
}
