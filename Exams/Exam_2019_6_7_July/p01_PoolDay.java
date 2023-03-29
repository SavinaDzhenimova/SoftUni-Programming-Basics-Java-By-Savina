package Exam_2019_6_7_July;

import java.util.Scanner;

public class p01_PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        double inputTax = Double.parseDouble(scanner.nextLine());
        double lounger = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());

        double inputTaxPrice = peopleCount * inputTax;
        double loungerCount = Math.ceil(peopleCount * 0.75);
        double loungerPrice = loungerCount * lounger;
        double umbrellaCount = Math.ceil(peopleCount * 0.50);
        double umbrellaPrice = umbrellaCount * umbrella;
        double total = inputTaxPrice + loungerPrice + umbrellaPrice;

        System.out.printf("%.2f lv.", total);
    }
}
