package Exam_2020_28_29_March;

import java.util.Scanner;

public class p05_CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtFoodKgs = Integer.parseInt(scanner.nextLine());
        int boughtFoodGrams = boughtFoodKgs * 1000;
        String command = scanner.nextLine();
        int totalEatenFood = 0;

        while (!command.equals("Adopted")) {
            int eatenFood = Integer.parseInt(command);
            totalEatenFood += eatenFood;
            command = scanner.nextLine();
        }

        if (totalEatenFood <= boughtFoodGrams) {
            System.out.printf("Food is enough! Leftovers: %d grams.%n", boughtFoodGrams - totalEatenFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.%n", totalEatenFood - boughtFoodGrams);
        }
    }
}
