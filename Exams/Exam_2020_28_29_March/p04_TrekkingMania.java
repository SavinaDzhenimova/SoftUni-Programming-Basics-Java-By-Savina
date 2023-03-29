package Exam_2020_28_29_March;

import java.util.Scanner;

public class p04_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int climbingMusalla = 0;
        int climbingMontBlanc = 0;
        int climbingKilimanjaro = 0;
        int climbingK2 = 0;
        int climbingEverest = 0;
        int totalPeople = 0;

        for (int i = 1; i <= n; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if (people <= 5) {
                climbingMusalla += people;
            } else if (people <= 12) {
                climbingMontBlanc += people;
            } else if (people <= 25) {
                climbingKilimanjaro += people;
            } else if (people <= 40) {
                climbingK2 += people;
            } else if (people >= 41) {
                climbingEverest += people;
            }
            totalPeople += people;
        }

        double percentMusalla = climbingMusalla * 1.0 / totalPeople * 100;
        double percentMontBlanc = climbingMontBlanc * 1.0 / totalPeople * 100;
        double percentKilimanjaro = climbingKilimanjaro * 1.0 / totalPeople * 100;
        double percentK2 = climbingK2 * 1.0 / totalPeople * 100;
        double percentEverest = climbingEverest * 1.0 / totalPeople * 100;

        System.out.printf("%.2f%%%n", percentMusalla);
        System.out.printf("%.2f%%%n", percentMontBlanc);
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);
    }
}
