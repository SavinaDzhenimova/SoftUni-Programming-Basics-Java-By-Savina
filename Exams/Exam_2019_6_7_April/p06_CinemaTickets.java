package Exam_2019_6_7_April;

import java.util.Scanner;

public class p06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int student = 0;
        int standard = 0;
        int kid = 0;
        int totalSoldTickets = 0;

        while (!movieName.equals("Finish")) {
            String currentMovie = movieName;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int soldTickets = 0;

            while (freeSeats > soldTickets) {
                String ticketType = scanner.nextLine();

                switch (ticketType) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                if (ticketType.equals("End")) {
                    break;
                }
                soldTickets++;
            }
            totalSoldTickets += soldTickets;
            double percentageFull = (soldTickets * 1.00 / freeSeats) * 100;
            System.out.printf("%s - %.2f%% full.%n", currentMovie, percentageFull);
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalSoldTickets);
        System.out.printf("%.2f%% student tickets.%n", (student * 1.00 / totalSoldTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (standard * 1.00 / totalSoldTickets) * 100);
        System.out.printf("%.2f%% kids tickets.%n", (kid * 1.00 / totalSoldTickets) * 100);
    }
}
