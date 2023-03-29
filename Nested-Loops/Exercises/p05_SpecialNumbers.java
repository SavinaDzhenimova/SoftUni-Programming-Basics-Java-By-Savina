package Exercises;

import java.util.Scanner;

public class p05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String currentNum = "" + i;

            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (currentDigit == 0 || number % currentDigit != 0) {
                    break;
                }
                if (j == 3 && number % currentDigit == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}