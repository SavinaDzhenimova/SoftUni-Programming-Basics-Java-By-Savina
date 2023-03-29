package Exam_2019_20_21_April;

import java.util.Scanner;

public class p01_EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsCount = Integer.parseInt(scanner.nextLine());
        int yeast = Integer.parseInt(scanner.nextLine());

        double sugarPrice = flourPrice * 0.75;
        double eggsPrice = flourPrice * 1.10;
        double yeastPrice = sugarPrice * 0.20;
        double total = flourKg * flourPrice + sugarKg * sugarPrice + eggsPrice * eggsCount + yeast * yeastPrice;
        System.out.printf("%.2f", total);
    }
}
