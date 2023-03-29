package Exercises;

import java.util.Scanner;

public class p07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chicken = Integer.parseInt(scan.nextLine());
        int fish = Integer.parseInt(scan.nextLine());
        int vegetarian = Integer.parseInt(scan.nextLine());

        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double vegetarianPrice = vegetarian * 8.15;
        double delivery = 2.50;

        double price = chickenPrice + fishPrice + vegetarianPrice;
        double dessert = price * 0.2;
        double total = price + dessert + delivery;

        System.out.println(total);
    }
}
