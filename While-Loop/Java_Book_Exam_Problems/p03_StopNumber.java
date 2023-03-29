package Java_Book_Exam_Problems;

import java.util.Scanner;

public class p03_StopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        if (0 <= n && n < m && m <= 10000 && s <= m) {
            for (int i = m; i >= n; i--) {
                if (i % 2 == 0 && i % 3 == 0) {
                    if (s == i) {
                        break;
                    } else {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}
