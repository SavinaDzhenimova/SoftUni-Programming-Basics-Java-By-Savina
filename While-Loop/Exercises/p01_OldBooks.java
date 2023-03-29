package Exercises;

import java.util.Scanner;

public class p01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        int count = 0;
        boolean isFound = true;
        String currentBook = scanner.nextLine();
        while (!currentBook.equals(searchedBook)) {
            count++;
            currentBook = scanner.nextLine();

            if (currentBook.equals("No More Books")) {
                isFound = false;
                break;
            }
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.%n", count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.%n", count);
        }
    }
}
