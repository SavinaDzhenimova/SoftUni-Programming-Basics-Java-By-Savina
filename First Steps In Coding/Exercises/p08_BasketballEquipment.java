package Exercises;

import java.util.Scanner;

public class p08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tax = Integer.parseInt(scan.nextLine());

        double sneakers = tax - tax * 0.40;
        double equipment = sneakers - sneakers * 0.20;
        double ball = equipment / 4;
        double accessories = ball / 5;

        double total = tax + sneakers + equipment + ball + accessories;
        System.out.println(total);
    }
}
