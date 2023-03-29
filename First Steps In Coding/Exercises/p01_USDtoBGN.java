package Exercises;

import java.util.Scanner;

public class p01_USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double usd = Double.parseDouble(scan.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}

