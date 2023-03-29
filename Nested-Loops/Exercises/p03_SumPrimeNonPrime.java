package Exercises;

import java.util.Scanner;

public class p03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!input.equals("stop")) {
            int currentNum = Integer.parseInt(input);
            boolean isNonPrime = false;

            if (currentNum < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 2; i < currentNum; i++) {
                if (currentNum % i == 0) {
                    isNonPrime = true;
                    break;
                }
            }

            if (isNonPrime) {
                nonPrimeSum += currentNum;
            } else {
                primeSum += currentNum;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}
