package Exercises;

import java.util.Scanner;

public class p07_Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int p = Integer.parseInt(scan.nextLine());

        double nSum = n * 250.0;
        double mPrice = nSum * 0.35;
        double pPrice = nSum * 0.1;
        double mSum = m * mPrice;
        double pSum = p * pPrice;
        double totalSum = nSum + mSum + pSum;

        if (n > m) {
            totalSum = totalSum - totalSum * 0.15;
        }

        if (budget >= totalSum) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}
