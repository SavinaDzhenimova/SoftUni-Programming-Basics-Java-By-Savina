package Exam_2023_18_19_February;

import java.util.Scanner;

public class p01_CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentFats = Integer.parseInt(scanner.nextLine());
        int percentProteins = Integer.parseInt(scanner.nextLine());
        int percentCarbohydrates = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int percentageWater = Integer.parseInt(scanner.nextLine());

        double fatsGrams = ((percentFats * 1.00 / 100) * allCalories) / 9;
        double proteinsGrams = ((percentProteins * 1.00 / 100) * allCalories) / 4;
        double carbohydratesGrams = ((percentCarbohydrates * 1.00 / 100) * allCalories) / 4;
        double foodWeight = fatsGrams + proteinsGrams + carbohydratesGrams;
        double caloriesPerGram = allCalories / foodWeight;
        double caloriesWithoutWater = caloriesPerGram - ((percentageWater * 1.00 / 100) * caloriesPerGram);
        System.out.printf("%.4f%n", caloriesWithoutWater);
    }
}
