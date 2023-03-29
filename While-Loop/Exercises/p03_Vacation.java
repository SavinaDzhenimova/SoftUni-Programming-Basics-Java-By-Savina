package Exercises;

import java.util.Scanner;

public class p03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());

        int spendingCounter = 0;
        int daysCounter = 0;
        while (moneyOnHand < neededMoney && spendingCounter < 5) {
            String activity = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            daysCounter++;

            if (activity.equals("save")) {
                moneyOnHand += amount;
                spendingCounter = 0;
            } else if (activity.equals("spend")) {
                moneyOnHand -= amount;
                spendingCounter++;
                if (moneyOnHand < 0) {
                    moneyOnHand = 0;
                }
            }
        }

        if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }
        if (moneyOnHand >= neededMoney) {
            System.out.printf("You saved the money for %d days.%n", daysCounter);
        }
    }
}
