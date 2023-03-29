package Exercises;

import java.util.Scanner;

public class p06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int totalTickets = 0;

        while (!movieName.equals("Finish")) {
            String currentMovie = movieName;
            int freeSpaces = Integer.parseInt(scanner.nextLine());
            int count = 0;

            for (int i = 1; i <= freeSpaces; i++) {
                String ticketType = scanner.nextLine();
                switch (ticketType) {
                    case "standard":
                        standardTickets++;
                        break;
                    case "student":
                        studentTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                if (ticketType.equals("End") || count >= freeSpaces) {
                    break;
                }
                count++;
            }
            double percentageFull = (count * 1.00 / freeSpaces) * 100;
            System.out.printf("%s - %.2f%% full.%n", currentMovie, percentageFull);
            totalTickets += count;

            movieName = scanner.nextLine();
        }

        double percentStudentTickets = (studentTickets * 1.00 / totalTickets) * 100;
        double percentStandardTickets = (standardTickets * 1.00 / totalTickets) * 100;
        double percentKidTickets = (kidTickets * 1.00 / totalTickets) * 100;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudentTickets);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.%n", percentKidTickets);
    }
}
