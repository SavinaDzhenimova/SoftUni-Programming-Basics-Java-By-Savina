package More_Exercises;

import java.util.Scanner;

public class p03_Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vineyardArea = Integer.parseInt(scan.nextLine());
        double grapesPerSqM = Double.parseDouble(scan.nextLine());
        int neededLitresWine = Integer.parseInt(scan.nextLine());
        int workersCount = Integer.parseInt(scan.nextLine());

        double totalGrapes = vineyardArea * grapesPerSqM;
        double producedLitresWine = totalGrapes * 0.4 / 2.5;

        if (producedLitresWine < neededLitresWine) {
            double missingLitresWine = neededLitresWine - producedLitresWine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(missingLitresWine));
        } else if (producedLitresWine >= neededLitresWine) {
            double remainingLitresWine = producedLitresWine - neededLitresWine;
            double winePerWorker = remainingLitresWine / workersCount;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",
                    Math.floor(producedLitresWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",
                    Math.ceil(remainingLitresWine), Math.ceil(winePerWorker));
        }
    }
}
