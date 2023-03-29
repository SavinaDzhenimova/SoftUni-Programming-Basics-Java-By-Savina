package More_Exercises;

import java.util.Scanner;

public class p03_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        double busTones = 0;
        double truckTones = 0;
        double trainTones = 0;
        for (int i = 1; i <= n; i++) {
            int tones = Integer.parseInt(scanner.nextLine());

            if (tones <= 3) {
                sum += 200 * tones;
                busTones += tones;
            } else if (tones <= 11) {
                sum += 175 * tones;
                truckTones += tones;
            } else if (tones >= 12) {
                sum += 120 * tones;
                trainTones += tones;
            }
        }

        double totalTones = busTones + truckTones + trainTones;
        double averagePerTone = sum / totalTones;
        double percentBus = (busTones / totalTones) * 100;
        double percentTruck = (truckTones / totalTones) * 100;
        double percentTrain = (trainTones / totalTones) * 100;

        System.out.printf("%.2f%n", averagePerTone);
        System.out.printf("%.2f%%%n", percentBus);
        System.out.printf("%.2f%%%n", percentTruck);
        System.out.printf("%.2f%%%n", percentTrain);
    }
}
