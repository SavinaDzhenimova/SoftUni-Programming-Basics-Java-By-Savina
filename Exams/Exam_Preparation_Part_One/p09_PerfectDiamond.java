package Exam_Preparation_Part_One;

import java.util.Scanner;

public class p09_PerfectDiamond {
    static String repeatStr(String strToRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < count; i++) {
            text.append(strToRepeat);
        }
        return text.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(repeatStr(" ", n - i));
            System.out.print("*");

            for (int j = 0; j < i - 1; j++) {
                System.out.print("-*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            System.out.print(repeatStr(" ", n - i));
            System.out.print("*");

            for (int j = 1; j < i; j++) {
                System.out.print("-*");
            }
            System.out.println();
        }
    }
}
