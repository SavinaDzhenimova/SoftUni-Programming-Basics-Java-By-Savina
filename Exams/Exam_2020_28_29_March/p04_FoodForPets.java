package Exam_2020_28_29_March;

import java.util.Scanner;

public class p04_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double foodQuantity = Double.parseDouble(scanner.nextLine());

        int dogEatenFood = 0;
        int catEatenFood = 0;
        double biscuits = 0;

        for (int i = 1; i <= n; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                double currBiscuits = (dogFood + catFood) * 0.10;
                biscuits += currBiscuits;
            }

            dogEatenFood += dogFood;
            catEatenFood += catFood;
        }

        double totalFood = dogEatenFood + catEatenFood;
        double percentTotalFood = totalFood / foodQuantity * 100;
        double percentDogFood = dogEatenFood / totalFood * 100;
        double percentCatFood = catEatenFood / totalFood * 100;
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentTotalFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentDogFood);
        System.out.printf("%.2f%% eaten from the cat.%n", percentCatFood);
    }
}
