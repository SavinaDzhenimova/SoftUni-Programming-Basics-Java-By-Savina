package Exercises;

import java.util.Scanner;

public class p04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        double pricePerToy = Double.parseDouble(scanner.nextLine());

        int savedMoney = 0;
        int toysCount = 0;
        double moneyEvenAge = 10;

        for (int currentAge = 1; currentAge <= age; currentAge++) {
            if (currentAge % 2 == 0) {
                savedMoney += moneyEvenAge;
                moneyEvenAge += 10;
                savedMoney--;
            } else {
                toysCount++;
            }
        }

        savedMoney += toysCount * pricePerToy;

        if (savedMoney >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", savedMoney - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - savedMoney);
        }
    }
}
