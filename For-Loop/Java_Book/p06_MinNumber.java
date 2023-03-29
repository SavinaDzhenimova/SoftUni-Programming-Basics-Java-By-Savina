package Java_Book;

import java.util.Scanner;

public class p06_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the numbers: ");
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < min) {
                min = num;
            }
        }

        System.out.println("min = " + min);
    }
}
