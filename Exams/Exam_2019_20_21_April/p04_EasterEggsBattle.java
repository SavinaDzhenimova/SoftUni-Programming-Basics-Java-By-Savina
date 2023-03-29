package Exam_2019_20_21_April;

import java.util.Scanner;

public class p04_EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEggs = Integer.parseInt(scanner.nextLine());
        int secondEggs = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.equals("one")) {
                secondEggs--;
            } else if (command.equals("two")) {
                firstEggs--;
            }

            if (firstEggs <= 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", secondEggs);
                break;
            } else if (secondEggs <= 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.%n", firstEggs);
                break;
            }

            command = scanner.nextLine();
        }

        if (command.equals("End")) {
            System.out.printf("Player one has %d eggs left.%n", firstEggs);
            System.out.printf("Player two has %d eggs left.%n", secondEggs);
        }
    }
}
