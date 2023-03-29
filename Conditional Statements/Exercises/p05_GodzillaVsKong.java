package Exercises;

import java.util.Scanner;

public class p05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scan.nextLine());
        int extras = Integer.parseInt(scan.nextLine());
        double clothing = Double.parseDouble(scan.nextLine());

        double decorPrice = filmBudget * 0.1;
        double discount = (clothing * extras) * 0.1;
        double clothingPrice;

        if (extras > 150) {
            clothingPrice = clothing * extras - discount;
        } else {
            clothingPrice = clothing * extras;
        }

        double totalPrice = decorPrice + clothingPrice;
        double remainder = filmBudget - totalPrice;

        if (totalPrice > filmBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(remainder));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", remainder);
        }
    }
}
