package Exam_2019_15_16_June;

import java.util.Scanner;

public class p04_MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String actorName = scanner.nextLine();
        boolean noMoney = false;

        while (!actorName.equals("ACTION")) {

            if (actorName.length() > 15) {
                budget -= budget * 0.20;
            } else {
                actorName = scanner.nextLine();
                double salary = Double.parseDouble(actorName);
                budget -= salary;
            }

            if (budget <= 0) {
                noMoney = true;
                break;
            }

            actorName = scanner.nextLine();
        }

        if (noMoney) {
            System.out.printf("We need %.2f leva for our actors.%n", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.%n", budget);
        }
    }
}
