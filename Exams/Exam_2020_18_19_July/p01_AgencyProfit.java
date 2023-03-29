package Exam_2020_18_19_July;

import java.util.Scanner;

public class p01_AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airlineName = scanner.nextLine();
        int seniorsTickets = Integer.parseInt(scanner.nextLine());
        int juniorTickets = Integer.parseInt(scanner.nextLine());
        double seniorsTicketPrice = Double.parseDouble(scanner.nextLine());
        double serviceTax = Double.parseDouble(scanner.nextLine());

        double juniorTicketPrice = seniorsTicketPrice * 0.30;
        double seniorTicketWithServiceTax = seniorsTicketPrice + serviceTax;
        double juniorTicketWithServiceTax = juniorTicketPrice + serviceTax;
        double total = seniorTicketWithServiceTax * seniorsTickets + juniorTicketWithServiceTax * juniorTickets;
        double profit = total * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airlineName, profit);
    }
}
