package Exercises;

import java.util.Scanner;

public class p05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        int cleanser = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double cleanserPrice = cleanser * 1.20;
        double price = pensPrice + markersPrice + cleanserPrice;
        double discountPrice = price - (price * discount / 100);

        System.out.println(discountPrice);
    }
}
