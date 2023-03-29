package Exam_2019_20_21_April;

import java.util.Scanner;

public class p06_EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clientsCount = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double total = 0;

        for (int i = 1; i<= clientsCount; i++) {
            String product = scanner.nextLine();
            double totalPrice = 0;
            int productsCount = 0;

            while (!product.equals("Finish")) {
                productsCount++;
                switch (product) {
                    case "basket":
                        price = 1.50;
                        break;
                    case "wreath":
                        price = 3.80;
                        break;
                    case "chocolate bunny":
                        price = 7.00;
                        break;
                }
                totalPrice += price;
                product = scanner.nextLine();
            }
            if (productsCount % 2 == 0) {
                totalPrice = totalPrice * 0.80;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", productsCount, totalPrice);
            total += totalPrice;
        }
        System.out.printf("Average bill per client is: %.2f leva.", total / clientsCount);
    }
}
