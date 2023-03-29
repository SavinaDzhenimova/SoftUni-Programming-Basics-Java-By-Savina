package Java_Book_Exam_Problems;

import java.util.Scanner;

public class p05_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int numCopy = num;
        int digit3 = numCopy % 10;
        numCopy /= 10;
        int digit2 = numCopy % 10;
        numCopy /= 10;
        int digit1 = numCopy % 10;

        for (int i = 0; i < digit1 + digit2; i++) {
            for (int j = 0; j < digit1 + digit3; j++) {
                if (num % 5 == 0) {
                    num -= digit1;
                    System.out.printf("%d ",num);
                }else if (num % 3 == 0) {
                    num -= digit2;
                    System.out.printf("%d ",num);
                }else {
                    num += digit3;
                    System.out.printf("%d ",num);
                }
            }
            System.out.println();
        }
    }
}
