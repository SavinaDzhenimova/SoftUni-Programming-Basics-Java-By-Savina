package Exam_2019_9_10_March;

import java.util.Scanner;

public class p03_WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stageOfChampionship = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        boolean pictureWithTrophy = scanner.nextLine().equals("Y");
        double price = 0.0;

        switch (stageOfChampionship) {
            case "Quarter final":
                switch (ticketType) {
                    case "Standard":
                        price = 55.50;
                        break;
                    case "Premium":
                        price = 105.20;
                        break;
                    case "VIP":
                        price = 118.90;
                        break;
                }
                break;
            case "Semi final":
                switch (ticketType) {
                    case "Standard":
                        price = 75.88;
                        break;
                    case "Premium":
                        price = 125.22;
                        break;
                    case "VIP":
                        price = 300.40;
                        break;
                }
                break;
            case "Final":
                switch (ticketType) {
                    case "Standard":
                        price = 110.10;
                        break;
                    case "Premium":
                        price = 160.66;
                        break;
                    case "VIP":
                        price = 400.00;
                        break;
                }
                break;
        }

        price = price * quantity;

        if (price > 4000) {
            price = price * 0.75;
            pictureWithTrophy = false;
        } else if (price > 2500) {
            price = price * 0.90;
        }

        if (pictureWithTrophy) {
            price = price + (quantity * 40);
        }

        System.out.printf("%.2f", price);
    }
}
