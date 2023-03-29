package Exam_2020_18_19_July;

import java.util.Scanner;

public class p05_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int maxGoals = 0;
        String bestPlayer = "";

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > maxGoals) {
                maxGoals = goals;
                bestPlayer = name;
            }

            if (goals >= 10) {
                break;
            }

            name = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.%n", maxGoals);
        }
    }
}
