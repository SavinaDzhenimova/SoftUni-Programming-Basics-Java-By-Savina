package Exercises;

import java.util.Scanner;

public class p09_FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percentage = Double.parseDouble(scan.nextLine());

        int capacityCubicCm = length * width * height;
        double capacityLiters = capacityCubicCm * 0.001;
        double occupiedSpace = percentage * 0.01;
        double liters = capacityLiters * (1 - occupiedSpace);

        System.out.println(liters);
    }
}
