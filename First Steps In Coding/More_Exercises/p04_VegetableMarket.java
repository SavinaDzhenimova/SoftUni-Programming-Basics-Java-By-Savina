package More_Exercises;

import java.util.Scanner;

public class p04_VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = Double.parseDouble(scan.nextLine());
        double m = Double.parseDouble(scan.nextLine());
        int kgN = Integer.parseInt(scan.nextLine());
        int kgM = Integer.parseInt(scan.nextLine());

        double nPrice = n * kgN;
        double mPrice = m * kgM;
        double total = (nPrice + mPrice) / 1.94;

        System.out.printf("%.2f", total);
    }
}
