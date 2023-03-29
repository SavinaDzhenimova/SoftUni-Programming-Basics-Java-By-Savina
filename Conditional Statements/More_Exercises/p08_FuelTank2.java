package More_Exercises;

import java.util.Scanner;

public class p08_FuelTank2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuel = scan.nextLine();
        double liters = Double.parseDouble(scan.nextLine());
        String card = scan.nextLine();
        double gasPrice, dieselPrice, gasolinePrice;

        switch (fuel) {
            case "Gas":
                if (card.equals("Yes")) {
                    gasPrice = liters * (0.93 - 0.08);
                    if (liters >= 20 && liters <= 25) {
                        System.out.printf("%.2f lv.", gasPrice - (gasPrice * 0.08));
                    } else if (liters > 25) {
                        System.out.printf("%.2f lv.", gasPrice - (gasPrice * 0.10));
                    } else if (liters < 20) {
                        System.out.printf("%.2f lv.", gasPrice);
                    }
                } else if (card.equals("No")) {
                    gasPrice = liters * 0.93;
                    if (liters >= 20 && liters <= 25) {
                        System.out.printf("%.2f lv.", gasPrice - (gasPrice * 0.08));
                    } else if (liters > 25) {
                        System.out.printf("%.2f lv.", gasPrice - (gasPrice * 0.10));
                    } else if (liters < 20) {
                        System.out.printf("%.2f lv.", gasPrice);
                    }
                }
                break;
            case "Gasoline":
                if (card.equals("Yes")) {
                    gasolinePrice = liters * (2.22 - 0.18);
                    if (liters >= 20 && liters <= 25) {
                        System.out.printf("%.2f lv.", gasolinePrice - (gasolinePrice * 0.08));
                    } else if (liters > 25) {
                        System.out.printf("%.2f lv.", gasolinePrice - (gasolinePrice * 0.10));
                    } else if (liters < 20) {
                        System.out.printf("%.2f lv.", gasolinePrice);
                    }
                } else if (card.equals("No")) {
                    gasolinePrice = liters * 2.22;
                    if (liters >= 20 && liters <= 25) {
                        System.out.printf("%.2f lv.", gasolinePrice - (gasolinePrice * 0.08));
                    } else if (liters > 25) {
                        System.out.printf("%.2f lv.", gasolinePrice - (gasolinePrice * 0.10));
                    } else if (liters < 20) {
                        System.out.printf("%.2f lv.", gasolinePrice);
                    }
                }
                break;
            case "Diesel":
                if (card.equals("Yes")) {
                    dieselPrice = liters * (2.33 - 0.12);
                    if (liters >= 20 && liters <= 25) {
                        System.out.printf("%.2f lv.", dieselPrice - (dieselPrice * 0.08));
                    } else if (liters > 25) {
                        System.out.printf("%.2f lv.", dieselPrice - (dieselPrice * 0.10));
                    } else if (liters < 20) {
                        System.out.printf("%.2f lv.", dieselPrice);
                    }
                } else if (card.equals("No")) {
                    dieselPrice = liters * 2.33;
                    if (liters >= 20 && liters <= 25) {
                        System.out.printf("%.2f lv.", dieselPrice - (dieselPrice * 0.08));
                    } else if (liters > 25) {
                        System.out.printf("%.2f lv.", dieselPrice - (dieselPrice * 0.10));
                    } else if (liters < 20) {
                        System.out.printf("%.2f lv.", dieselPrice);
                    }
                }
                break;
        }
    }
}
