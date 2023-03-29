package Exercises;

import java.util.Scanner;

public class p05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        double totalSum = Math.floor(sum * 100);
        int coinsCounter = 0;

        while (totalSum > 0) {

            if (totalSum >= 200) {
                totalSum -= 200;
                coinsCounter++;
            } else if (totalSum >= 100) {
                totalSum -= 100;
                coinsCounter++;
            } else if (totalSum >= 50) {
                totalSum -= 50;
                coinsCounter++;
            } else if (totalSum >= 20) {
                totalSum -= 20;
                coinsCounter++;
            } else if (totalSum >= 10) {
                totalSum -= 10;
                coinsCounter++;
            } else if (totalSum >= 5) {
                totalSum -= 5;
                coinsCounter++;
            } else if (totalSum >= 2) {
                totalSum -= 2;
                coinsCounter++;
            } else if (totalSum >= 1) {
                totalSum -= 1;
                coinsCounter++;
            }
        }

        System.out.println(coinsCounter);
    }
}
