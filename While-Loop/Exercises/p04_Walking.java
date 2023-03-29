package Exercises;

import java.util.Scanner;

public class p04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int countSteps = 0;
        while (!input.equals("Going home")) {
            int currentSteps = Integer.parseInt(input);
            countSteps += currentSteps;

            if (countSteps >= 10000) {
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            countSteps += stepsToHome;
        }

        if (countSteps > 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!%n", countSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.%n", 10000 - countSteps);
        }
    }
}
