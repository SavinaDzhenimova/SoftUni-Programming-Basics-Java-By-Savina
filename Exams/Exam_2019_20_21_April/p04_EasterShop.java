package Exam_2019_20_21_April;

import java.util.Scanner;

public class p04_EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsCount = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int soldEggs = 0;
        boolean isNotEnough = false;

        while (!command.equals("Close")) {
            int count = Integer.parseInt(scanner.nextLine());

            if (command.equals("Fill")) {
                eggsCount += count;
            } else if (command.equals("Buy")) {
                if (count > eggsCount) {
                    isNotEnough = true;
                    break;
                } else {
                    eggsCount -= count;
                    soldEggs += count;
                }
            }

            command = scanner.nextLine();
        }

        if (isNotEnough) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.%n", eggsCount);
        }
        if (command.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.%n", soldEggs);
        }
    }
}
