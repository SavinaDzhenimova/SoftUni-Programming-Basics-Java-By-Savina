package Exam_2023_18_19_February;

import java.util.Scanner;

public class p02_DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int absentDaysCount = Integer.parseInt(scanner.nextLine());
        int leftFoodInKilos = Integer.parseInt(scanner.nextLine());
        double foodFirstDeerPerDay = Double.parseDouble(scanner.nextLine());
        double foodSecondDeerPerDay = Double.parseDouble(scanner.nextLine());
        double foodThirdDeerPerDay = Double.parseDouble(scanner.nextLine());

        double firstDeerFood = foodFirstDeerPerDay * absentDaysCount;
        double secondDeerFood = foodSecondDeerPerDay * absentDaysCount;
        double thirdDeerFood = foodThirdDeerPerDay * absentDaysCount;
        double neededFood = firstDeerFood + secondDeerFood + thirdDeerFood;

        if (leftFoodInKilos >= neededFood) {
            System.out.printf("%.0f kilos of food left.%n", Math.floor(leftFoodInKilos - neededFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.%n", Math.ceil(neededFood - leftFoodInKilos));
        }
    }
}
