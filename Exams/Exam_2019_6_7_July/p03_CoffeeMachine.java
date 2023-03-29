package Exam_2019_6_7_July;

import java.util.Scanner;

public class p03_CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drinkType = scanner.nextLine();
        String sugarContent = scanner.nextLine();
        int drinkCount = Integer.parseInt(scanner.nextLine());
        double drinkPrice = 0.0;
        double total = 0.0;

        if (drinkType.equals("Espresso")) {
            if (sugarContent.equals("Without")) {
                drinkPrice = 0.90;
            } else if (sugarContent.equals("Normal")) {
                drinkPrice = 1.00;
            } else if (sugarContent.equals("Extra")) {
                drinkPrice = 1.20;
            }
        } else if (drinkType.equals("Cappuccino")) {
            if (sugarContent.equals("Without")) {
                drinkPrice = 1.00;
            } else if (sugarContent.equals("Normal")) {
                drinkPrice = 1.20;
            } else if (sugarContent.equals("Extra")) {
                drinkPrice = 1.60;
            }
        } else if (drinkType.equals("Tea")) {
            if (sugarContent.equals("Without")) {
                drinkPrice = 0.50;
            } else if (sugarContent.equals("Normal")) {
                drinkPrice = 0.60;
            } else if (sugarContent.equals("Extra")) {
                drinkPrice = 0.70;
            }
        }

        total = drinkCount * drinkPrice;
        if (sugarContent.equals("Without")) {
            total = total * 0.65;
        }
        if (drinkType.equals("Espresso")) {
            if (drinkCount >= 5) {
                total = total * 0.75;
            }
        }
        if (total > 15) {
            total = total * 0.80;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", drinkCount, drinkType, total);
    }
}
