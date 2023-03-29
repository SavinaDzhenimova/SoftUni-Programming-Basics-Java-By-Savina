package More_Exercises;

import java.util.Scanner;

public class p07_FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuel = scan.nextLine();
        double liters = Double.parseDouble(scan.nextLine());

        switch (fuel) {
            case "Diesel":
            case "Gasoline":
            case "Gas":
                if (liters >= 25) {
                    System.out.printf("You have enough %s.", fuel.toLowerCase());
                } else if (liters < 25) {
                    System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
                }
                break;
            default:
                System.out.println("Invalid fuel!");
                break;
        }
    }
}
