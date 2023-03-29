package More_Exercises;

import java.util.Scanner;

public class p03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemumsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipsCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isHoliday = scanner.nextLine();
        double totalPrice = 0.0;

        if (season.equals("Spring") || season.equals("Summer")) {
            totalPrice = chrysanthemumsCount * 2.00 + rosesCount * 4.10 + tulipsCount * 2.50;
            if (season.equals("Spring")) {
                if (tulipsCount > 7) {
                    totalPrice = totalPrice * 0.95;
                }
            }
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            totalPrice = chrysanthemumsCount * 3.75 + rosesCount * 4.50 + tulipsCount * 4.15;
            if (season.equals("Winter")) {
                if (rosesCount >= 10) {
                    totalPrice = totalPrice * 0.90;
                }
            }
        }

        if (chrysanthemumsCount + rosesCount + tulipsCount > 20) {
            totalPrice = totalPrice * 0.80;
        }

        if (isHoliday.equals("Y")) {
            totalPrice = totalPrice + totalPrice * 0.15;
        }

        System.out.printf("%.2f", (totalPrice + 2));
    }
}
