package Exam_2019_20_21_April;

import java.util.Scanner;

public class p03_PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String colour = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (size) {
            case "Large":
                switch (colour) {
                    case "Red":
                        price = 16;
                        break;
                    case "Green":
                        price = 12;
                        break;
                    case "Yellow":
                        price = 9;
                        break;
                }
                break;
            case "Medium":
                switch (colour) {
                    case "Red":
                        price = 13;
                        break;
                    case "Green":
                        price = 9;
                        break;
                    case "Yellow":
                        price = 7;
                        break;
                }
                break;
            case "Small":
                switch (colour) {
                    case "Red":
                        price = 9;
                        break;
                    case "Green":
                        price = 8;
                        break;
                    case "Yellow":
                        price = 5;
                        break;
                }
                break;
        }

        double total = price * count;
        double taxes = total * 0.35;
        System.out.printf("%.2f leva.", total - taxes);
    }
}
