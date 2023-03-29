package Exam_2019_6_7_April;

import java.util.Scanner;

public class p03_OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String haulType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0.0;

        if (movieName.equals("A Star Is Born")) {
            if (haulType.equals("normal")) {
                ticketPrice = 7.50;
            } else if (haulType.equals("luxury")) {
                ticketPrice = 10.50;
            } else if (haulType.equals("ultra luxury")) {
                ticketPrice = 13.50;
            }
        } else if (movieName.equals("Bohemian Rhapsody")) {
            if (haulType.equals("normal")) {
                ticketPrice = 7.35;
            } else if (haulType.equals("luxury")) {
                ticketPrice = 9.45;
            } else if (haulType.equals("ultra luxury")) {
                ticketPrice = 12.75;
            }
        } else if (movieName.equals("Green Book")) {
            if (haulType.equals("normal")) {
                ticketPrice = 8.15;
            } else if (haulType.equals("luxury")) {
                ticketPrice = 10.25;
            } else if (haulType.equals("ultra luxury")) {
                ticketPrice = 13.25;
            }
        } else if (movieName.equals("The Favourite")) {
            if (haulType.equals("normal")) {
                ticketPrice = 8.75;
            } else if (haulType.equals("luxury")) {
                ticketPrice = 11.55;
            } else if (haulType.equals("ultra luxury")) {
                ticketPrice = 13.95;
            }
        }

        double total = ticketPrice * tickets;
        System.out.printf("%s -> %.2f lv.", movieName, total);
    }
}
