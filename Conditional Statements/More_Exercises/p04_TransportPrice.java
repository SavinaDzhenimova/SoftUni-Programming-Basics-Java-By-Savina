package More_Exercises;

import java.util.Scanner;

public class p04_TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int km = Integer.parseInt(scan.nextLine());
        String partOfDay = scan.nextLine();

        double taxiDay = 0.70 + km * 0.79;
        double taxiNight = 0.70 + km * 0.90;
        double bus = km * 0.09;
        double train = km * 0.06;

        if (partOfDay.equals("day")) {
            if (km < 20) {
                System.out.printf("%.2f", taxiDay);
            } else if (km >= 20 && km < 100) {
                System.out.printf("%.2f", Math.min(taxiDay, bus));
            } else if (km >= 100) {
                if (taxiDay > bus && taxiDay > train) {
                    System.out.printf("%.2f", Math.min(bus, train));
                } else if (bus > taxiDay && bus > train) {
                    System.out.printf("%.2f", Math.min(taxiDay, train));
                } else if (train > taxiDay && train > bus) {
                    System.out.printf("%.2f", Math.min(bus, taxiDay));
                }
            }
        } else if (partOfDay.equals("night")) {
            if (km < 20) {
                System.out.printf("%.2f", taxiNight);
            } else if (km >= 20 && km < 100) {
                System.out.printf("%.2f", Math.min(taxiNight, bus));
            } else if (km >= 100) {
                if (taxiNight > bus && taxiNight > train) {
                    System.out.printf("%.2f", Math.min(bus, train));
                } else if (bus > taxiNight && bus > train) {
                    System.out.printf("%.2f", Math.min(taxiNight, train));
                } else if (train > taxiNight && train > bus) {
                    System.out.printf("%.2f", Math.min(bus, taxiNight));
                }
            }
        }
    }
}
