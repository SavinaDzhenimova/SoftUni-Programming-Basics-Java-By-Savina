package Java_Book;

import java.util.Scanner;

public class p11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter even number: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0) {
                break;
            }
            System.out.println("The number is not even.");
        }
        System.out.printf("Even number entered: %d.", n);
    }
}
