package Java_Book;

import java.util.Scanner;

public class p03_PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;

        for (int i = 0; i <= n; i += 1) {
            System.out.println(num);
            num *= 2;
        }
    }
}
