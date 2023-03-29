package More_Exercises;

import java.util.Scanner;

public class p06_FishLand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mackerel = Double.parseDouble(scan.nextLine());
        double sprinkle = Double.parseDouble(scan.nextLine());
        double bonitoKG = Double.parseDouble(scan.nextLine());
        double scadKG = Double.parseDouble(scan.nextLine());
        int clamKG = Integer.parseInt(scan.nextLine());

        double bonitoPrice = mackerel + mackerel * 0.6;
        double scadPrice = sprinkle + sprinkle * 0.8;
        double bonitoTotal = bonitoPrice * bonitoKG;
        double scadTotal = scadPrice * scadKG;
        double clamPrice = clamKG * 7.50;
        double total = bonitoTotal + scadTotal + clamPrice;

        System.out.printf("%.2f", total);
    }
}
