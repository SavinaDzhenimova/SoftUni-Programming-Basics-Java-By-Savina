package Exercises;

import java.util.Scanner;

public class p06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0.0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", num1, operator, num2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", num1, operator, num2, result);
                }
                break;
            case "-":
                result = num1 - num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", num1, operator, num2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", num1, operator, num2, result);
                }
                break;
            case "*":
                result = num1 * num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", num1, operator, num2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", num1, operator, num2, result);
                }
                break;
            case "/":
                result = (double) num1 / num2;
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    System.out.printf("%d / %d = %.02f", num1, num2, result);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 % num2));
                }
                break;
        }
    }
}
