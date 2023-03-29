package Java_Book;

import java.util.Scanner;

public class p05_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int k = 1; k <= n; k = k * 2 + 1) {
            System.out.println(k);
        }
    }
}
