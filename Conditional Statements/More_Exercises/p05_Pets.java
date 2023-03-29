package More_Exercises;

import java.util.Scanner;

public class p05_Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int leftFood = Integer.parseInt(scan.nextLine());
        double dog = Double.parseDouble(scan.nextLine());
        double cat = Double.parseDouble(scan.nextLine());
        double turtle = Double.parseDouble(scan.nextLine());

        double dogFood = days * dog;
        double catFood = days * cat;
        double turtleFood = (days * turtle) / 1000;
        double totalFood = dogFood + catFood + turtleFood;

        if (leftFood > totalFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(leftFood - totalFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood - leftFood));
        }
    }
}
