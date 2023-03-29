package Java_Book;

import java.util.Scanner;

public class p10_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            sum += num;
            if (num > max) {
                max = num;
            }
        }

        int sumWithoutMax = sum - max;
        int diff = max - sumWithoutMax;
        if (sumWithoutMax == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumWithoutMax);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(diff));
        }
    }
}
