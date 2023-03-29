package Exam_2020_18_19_July;

import java.util.Scanner;

public class p02_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bagOver20Kg = Double.parseDouble(scanner.nextLine());
        double bagKg = Double.parseDouble(scanner.nextLine());
        int daysTillFlight = Integer.parseInt(scanner.nextLine());
        int bagsNumber = Integer.parseInt(scanner.nextLine());
        double bagPrice = 0.0;

        if (bagKg < 10) {
            bagPrice = bagOver20Kg * 0.20;
        } else if (bagKg >= 10 && bagKg <= 20) {
            bagPrice = bagOver20Kg * 0.50;
        } else if (bagKg > 20) {
            bagPrice = bagOver20Kg;
        }

        if (daysTillFlight > 30) {
            bagPrice = bagPrice * 1.10;
        } else if (daysTillFlight >= 7 && daysTillFlight <= 30) {
            bagPrice = bagPrice * 1.15;
        } else if (daysTillFlight < 7) {
            bagPrice = bagPrice * 1.40;
        }

        double totalPrice = bagPrice * bagsNumber;
        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);
    }
}
