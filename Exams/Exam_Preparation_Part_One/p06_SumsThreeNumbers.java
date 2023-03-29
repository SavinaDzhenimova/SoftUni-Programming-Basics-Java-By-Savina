package Exam_Preparation_Part_One;

import java.util.Scanner;

public class p06_SumsThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a + b == c) {
            if (a > b) {
                System.out.printf("%d + %d = %d", b, a, c);
            } else {
                System.out.printf("%d + %d = %d", a, b, c);
            }
        } else if (b + c == a) {
            if (b < c) {
                System.out.printf("%d + %d = %d", b, c, a);
            } else {
                System.out.printf("%d + %d = %d", c, b, a);
            }
        } else if (a + c == b) {
            if (a < c) {
                System.out.printf("%d + %d = %d", a, c, b);
            } else {
                System.out.printf("%d + %d = %d", c, a, b);
            }
        } else {
            System.out.println("No");
        }
    }
}
