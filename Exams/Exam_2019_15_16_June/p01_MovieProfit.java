package Exam_2019_15_16_June;

import java.util.Scanner;

public class p01_MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

        double profit = days * tickets * ticketPrice;
        double cinemaProfit = (percentage / 100.0) * profit;
        double studioProfit = profit - cinemaProfit;
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, studioProfit);
    }
}
