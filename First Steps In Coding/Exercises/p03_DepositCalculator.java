package Exercises;

import java.util.Scanner;

public class p03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double depositAmount = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double interest = Double.parseDouble(scan.nextLine());

        double accruedInterest = depositAmount * (interest / 100);
        double monthlyInterest = accruedInterest / 12;
        double amount = depositAmount + months * monthlyInterest;

        System.out.println(amount);
    }
}
