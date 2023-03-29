package Exam_2020_28_29_March;

import java.util.Scanner;

public class p01_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.20;
        double drinks = cake - cake * 0.45;
        double animator = (1.0 / 3.0) * rent;
        double total = rent + cake + drinks + animator;

        System.out.printf("%.1f", total);
    }
}
