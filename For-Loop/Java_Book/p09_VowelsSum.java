package Java_Book;

import java.util.Scanner;

public class p09_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        String string = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                sum += 1;
            } else if (string.charAt(i) == 'e') {
                sum += 2;
            } else if (string.charAt(i) == 'i') {
                sum += 3;
            } else if (string.charAt(i) == 'o') {
                sum += 4;
            } else if (string.charAt(i) == 'u') {
                sum += 5;
            }
        }

        System.out.println("Vowels sum = " + sum);
    }
}
