package Java_Book;

import java.util.Scanner;

public class p02_NumbersFromNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
