package More_Exercises;

import java.util.Scanner;

public class p12_TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int passwordFirstNumber = 0;
        int passwordSecondNumber = 0;
        int passwordThirdNumber = 0;
        int passwordFourthNumber = 0;
        boolean password = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        int magicNumber = a * b + c * d;
                        if (b > a && c > d && magicNumber == controlNumber) {
                            count++;
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                            if (count == 4) {
                                passwordFirstNumber = a;
                                passwordSecondNumber = b;
                                passwordThirdNumber = c;
                                passwordFourthNumber = d;
                                password = true;
                            }
                        }
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No!");
        } else if (count < 4) {
            System.out.println();
            System.out.println("No!");
            return;
        }
        if (password) {
            System.out.println();
            System.out.printf("Password: %d%d%d%d%n", passwordFirstNumber, passwordSecondNumber, passwordThirdNumber, passwordFourthNumber);
        }
    }
}
