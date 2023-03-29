package Exam_2019_2_3_May;

import java.util.Scanner;

public class p01_FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double raspberryQuantity = Double.parseDouble(scanner.nextLine());
        double strawberryQuantity = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice / 2;
        double orangesPrice = raspberryPrice * 0.60;
        double bananasPrice = raspberryPrice * 0.20;

        double totalPrice = strawberryQuantity * strawberryPrice + bananasQuantity * bananasPrice +
                orangesQuantity * orangesPrice + raspberryQuantity * raspberryPrice;

        System.out.printf("%.2f", totalPrice);
    }
}
