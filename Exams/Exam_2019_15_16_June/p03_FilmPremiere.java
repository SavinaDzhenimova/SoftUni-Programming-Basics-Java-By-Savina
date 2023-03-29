package Exam_2019_15_16_June;

import java.util.Scanner;

public class p03_FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String packet = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0.0;

        if (movieName.equals("John Wick")) {
            if (packet.equals("Drink")) {
                ticketPrice = 12;
            } else if (packet.equals("Popcorn")) {
                ticketPrice = 15;
            } else if (packet.equals("Menu")) {
                ticketPrice = 19;
            }
        } else if (movieName.equals("Star Wars")) {
            if (packet.equals("Drink")) {
                ticketPrice = 18;
            } else if (packet.equals("Popcorn")) {
                ticketPrice = 25;
            } else if (packet.equals("Menu")) {
                ticketPrice = 30;
            }
        } else if (movieName.equals("Jumanji")) {
            if (packet.equals("Drink")) {
                ticketPrice = 9;
            } else if (packet.equals("Popcorn")) {
                ticketPrice = 11;
            } else if (packet.equals("Menu")) {
                ticketPrice = 14;
            }
        }

        double totalPrice = tickets * ticketPrice;

        if (movieName.equals("Star Wars") && tickets >= 4) {
            totalPrice = totalPrice * 0.70;
        } else if (movieName.equals("Jumanji") && tickets == 2) {
            totalPrice = totalPrice * 0.85;
        }

        System.out.printf("Your bill is %.2f leva.", totalPrice);
    }
}
