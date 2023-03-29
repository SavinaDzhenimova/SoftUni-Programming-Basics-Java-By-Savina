package Java_Book;

import java.util.Scanner;

public class p12_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairs = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int prevSum = 0;
        int diff = 0;
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i <= pairs; i++) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            sum = first + second;

            if (i > 1) {
                diff = Math.abs(sum - prevSum);
            }

            prevSum = sum;

            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }

        if (diff == 0) {
            System.out.println("Yes, value=" + sum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
