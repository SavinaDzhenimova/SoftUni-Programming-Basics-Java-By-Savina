package More_Exercises;

import java.util.Scanner;

public class p07_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        double fanA = 0;
        double fanB = 0;
        double fanV = 0;
        double fanG = 0;

        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    fanA++;
                    break;
                case "B":
                    fanB++;
                    break;
                case "V":
                    fanV++;
                    break;
                case "G":
                    fanG++;
                    break;
            }
        }

        double percentA = (fanA / fans) * 100;
        double percentB = (fanB / fans) * 100;
        double percentV = (fanV / fans) * 100;
        double percentG = (fanG / fans) * 100;
        double percentFans = (fans * 1.00 / capacity) * 100;

        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%%n", percentFans);
    }
}
