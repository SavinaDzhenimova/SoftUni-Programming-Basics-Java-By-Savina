package Exam_2019_15_16_June;

import java.util.Scanner;

public class p05_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            String movieName = scanner.nextLine();
            double moviePrice = Double.parseDouble(scanner.nextLine());

            switch (movieName) {
                case "Thrones":
                    moviePrice -= moviePrice * 0.50;
                    break;
                case "Lucifer":
                    moviePrice -= moviePrice * 0.40;
                    break;
                case "Protector":
                    moviePrice -= moviePrice * 0.30;
                    break;
                case "TotalDrama":
                    moviePrice -= moviePrice * 0.20;
                    break;
                case "Area":
                    moviePrice -= moviePrice * 0.10;
                    break;
            }
            sum += moviePrice;
        }

        if (budget >= sum) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - sum);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", sum - budget);
        }
    }
}
