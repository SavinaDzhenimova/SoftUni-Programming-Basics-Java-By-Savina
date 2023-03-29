package Lab;

import java.util.Scanner;

public class p02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String inputPassword = scanner.nextLine();
        while (!inputPassword.equals(password)) {
            inputPassword = scanner.nextLine();
        }

        System.out.printf("Welcome %s!%n", username);
    }
}
