package Exam_2019_20_21_April;

import java.util.Scanner;

public class p02_EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (guests >= 10 && guests <= 15) {
            pricePerPerson = pricePerPerson * 0.85;
        } else if (guests > 15 && guests <= 20) {
            pricePerPerson = pricePerPerson * 0.80;
        } else if (guests > 20) {
            pricePerPerson = pricePerPerson * 0.75;
        }

        double birthdayCake = budget * 0.10;
        double total = pricePerPerson * guests + birthdayCake;

        if (budget >= total) {
            System.out.printf("It is party time! %.2f leva left.", budget - total);
        } else {
            System.out.printf("No party! %.2f leva needed.", total - budget);
        }
    }
}
