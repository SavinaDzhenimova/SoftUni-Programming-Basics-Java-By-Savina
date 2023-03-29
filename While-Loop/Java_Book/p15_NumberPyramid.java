package Java_Book;

import java.util.Scanner;

public class p15_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                if (num <= n) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }
}