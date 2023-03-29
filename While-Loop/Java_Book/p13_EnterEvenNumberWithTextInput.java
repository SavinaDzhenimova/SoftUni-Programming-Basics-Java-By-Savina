package Java_Book;

import java.util.Scanner;

public class p13_EnterEvenNumberWithTextInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while (true) {
            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n % 2 == 0) {
                    System.out.printf("Even number entered: %d.", n);
                    break;
                }
                System.out.println("The number is not even.");
            } catch (Exception ex) {
                System.out.println("Invalid number.");
            }
        }
    }
}
