package Exercises;

import java.util.Scanner;

public class p07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int groupMusalla = 0;
        int groupMontBlanc = 0;
        int groupKilimanjaro = 0;
        int groupK2 = 0;
        int groupEverest = 0;

        for (int i = 1; i <= n; i++) {
            int peoplePerGroup = Integer.parseInt(scanner.nextLine());

            if (peoplePerGroup <= 5) {
                groupMusalla += peoplePerGroup;
            } else if (peoplePerGroup <= 12) {
                groupMontBlanc += peoplePerGroup;
            } else if (peoplePerGroup <= 25) {
                groupKilimanjaro += peoplePerGroup;
            } else if (peoplePerGroup <= 40) {
                groupK2 += peoplePerGroup;
            } else if (peoplePerGroup >= 41) {
                groupEverest += peoplePerGroup;
            }
        }

        double allPeople = groupMusalla + groupMontBlanc + groupKilimanjaro + groupK2 + groupEverest;
        double percentMusalla = (groupMusalla / allPeople) * 100;
        double percentMontBlanc = (groupMontBlanc / allPeople) * 100;
        double percentKilimanjaro = (groupKilimanjaro / allPeople) * 100;
        double percentK2 = (groupK2 / allPeople) * 100;
        double percentEverest = (groupEverest / allPeople) * 100;

        System.out.printf("%.2f%%%n", percentMusalla);
        System.out.printf("%.2f%%%n", percentMontBlanc);
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);
    }
}
