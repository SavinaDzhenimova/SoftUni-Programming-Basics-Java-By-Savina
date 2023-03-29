package Exam_2019_2_3_May;

import java.util.Scanner;

public class p02_Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double expenses = fuel * 2.10 + 100;

        if (day.equals("Saturday")) {
            expenses = expenses * 0.90;
        } else if (day.equals("Sunday")) {
            expenses = expenses * 0.80;
        }

        if (budget >= expenses) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - expenses);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", expenses - budget);
        }
    }
}
