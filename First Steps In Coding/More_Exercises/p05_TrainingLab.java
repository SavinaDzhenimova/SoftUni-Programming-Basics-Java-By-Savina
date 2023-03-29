package More_Exercises;

import java.util.Scanner;

public class p05_TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        int rows = (int)(((h * 100) - 100) / 70);
        int places = (int)((w * 100) / 120);

        int workplaces = rows * places - 3;
        System.out.println(workplaces);
    }
}
