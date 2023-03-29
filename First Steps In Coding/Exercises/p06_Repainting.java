package Exercises;

import java.util.Scanner;

public class p06_Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double packages = 0.40;

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + paint * 0.1) * 14.50;
        double thinnerPrice = thinner * 5.00;

        double materialsPrice = nylonPrice + paintPrice + thinnerPrice + packages;
        double craftsman = (materialsPrice * 0.3) * hours;
        double totalPrice = materialsPrice + craftsman;

        System.out.println(totalPrice);
    }
}
