package Java_Book;

import java.util.Scanner;

public class p05_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the numbers: ");
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num > max) {
                max = num;
            }
        }

        System.out.println("max = " + max);
    }
}
