package Exam_2019_6_7_July;

import java.util.Scanner;

public class p04_Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());
        String cocktailName = scanner.nextLine();
        double sum = 0;

        while (!cocktailName.equals("Party!")) {
            int number = Integer.parseInt(scanner.nextLine());
            double price = cocktailName.length() * number;

            if (price % 2 != 0) {
                price -= price * 0.25;
            }
            sum += price;

            if (sum >= profit) {
                break;
            }
            cocktailName = scanner.nextLine();
        }

        if (cocktailName.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", profit - sum);
        }
        if (sum >= profit) {
            System.out.println("Target acquired.");
        }
        System.out.printf("Club income - %.2f leva.%n", sum);
    }
}
