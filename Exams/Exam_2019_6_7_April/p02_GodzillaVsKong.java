package Exam_2019_6_7_April;

import java.util.Scanner;

public class p02_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int extrasCount = Integer.parseInt(scanner.nextLine());
        double clothesPricePerExtra = Double.parseDouble(scanner.nextLine());

        double decorPrice = movieBudget * 0.10;
        double clothesPrice = extrasCount * clothesPricePerExtra;

        if (extrasCount > 150) {
            clothesPrice = clothesPrice * 0.90;
        }

        double total = decorPrice + clothesPrice;

        if (total > movieBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - movieBudget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", movieBudget - total);
        }
    }
}
