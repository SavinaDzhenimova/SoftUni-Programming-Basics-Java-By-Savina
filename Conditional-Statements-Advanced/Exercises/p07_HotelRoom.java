package Exercises;

import java.util.Scanner;

public class p07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50;
            apartmentPrice = 65;
            studioPrice = nights * studioPrice;
            apartmentPrice = nights * apartmentPrice;
            if (nights > 14) {
                studioPrice = studioPrice * 0.70;
                apartmentPrice = apartmentPrice * 0.90;
            } else if (nights > 7) {
                studioPrice = studioPrice * 0.95;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20;
            apartmentPrice = 68.70;
            studioPrice = nights * studioPrice;
            apartmentPrice = nights * apartmentPrice;
            if (nights > 14) {
                studioPrice = studioPrice * 0.80;
                apartmentPrice = apartmentPrice * 0.90;
            }
        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76;
            apartmentPrice = 77;
            studioPrice = nights * studioPrice;
            apartmentPrice = nights * apartmentPrice;
            if (nights > 14) {
                apartmentPrice = apartmentPrice * 0.90;
            }
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
