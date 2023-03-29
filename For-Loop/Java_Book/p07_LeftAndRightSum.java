package Java_Book;

import java.util.Scanner;

public class p07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the numbers: ");

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum += Integer.parseInt(scanner.nextLine());
        }

        for (int i = 1; i <= n; i++) {
            rightSum += Integer.parseInt(scanner.nextLine());
        }

        if (leftSum == rightSum) {
            System.out.print("Yes, sum = " + leftSum);
        } else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.print("No, diff = " + diff);
        }
    }
}
