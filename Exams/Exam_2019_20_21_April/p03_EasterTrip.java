package Exam_2019_20_21_April;

import java.util.Scanner;

public class p03_EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String dates = scanner.nextLine();
        int overnights = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (country) {
            case "France":
                switch (dates) {
                    case "21-23":
                        price = 30;
                        break;
                    case "24-27":
                        price = 35;
                        break;
                    case "28-31":
                        price = 40;
                        break;
                }
                break;
            case "Italy":
                switch (dates) {
                    case "21-23":
                        price = 28;
                        break;
                    case "24-27":
                        price = 32;
                        break;
                    case "28-31":
                        price = 39;
                        break;
                }
                break;
            case "Germany":
                switch (dates) {
                    case "21-23":
                        price = 32;
                        break;
                    case "24-27":
                        price = 37;
                        break;
                    case "28-31":
                        price = 43;
                        break;
                }
                break;
        }

        double total = price * overnights;
        System.out.printf("Easter trip to %s : %.2f leva.", country, total);
    }
}
