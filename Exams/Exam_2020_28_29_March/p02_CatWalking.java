package Exam_2020_28_29_March;

import java.util.Scanner;

public class p02_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int walksCount = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        double walkTime = minutesWalk * walksCount;
        double burnedCalories = walkTime * 5;
        double calories50Percent = calories * 0.50;

        if (burnedCalories >= calories50Percent) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.", burnedCalories);
        }
    }
}
