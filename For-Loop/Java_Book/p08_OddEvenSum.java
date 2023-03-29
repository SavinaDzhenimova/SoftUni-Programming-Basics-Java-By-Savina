package Java_Book;

import java.util.Scanner;

public class p08_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the numbers: ");

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(evenSum - oddSum));
        }
    }
}
