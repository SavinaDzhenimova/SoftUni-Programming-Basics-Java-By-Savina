package More_Exercises;

import java.util.Scanner;

public class p05_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String accommodation = "";

        if (season.equals("Summer")) {
            if (budget <= 1000) {
                accommodation = "Camp";
                location = "Alaska";
                budget = budget * 0.65;
            } else if (budget > 1000 && budget <= 3000) {
                accommodation = "Hut";
                location = "Alaska";
                budget = budget * 0.80;
            } else if (budget > 3000) {
                accommodation = "Hotel";
                location = "Alaska";
                budget = budget * 0.90;
            }
        } else if (season.equals("Winter")) {
            if (budget <= 1000) {
                accommodation = "Camp";
                location = "Morocco";
                budget = budget * 0.45;
            } else if (budget > 1000 && budget <= 3000) {
                accommodation = "Hut";
                location = "Morocco";
                budget = budget * 0.60;
            } else if (budget > 3000) {
                accommodation = "Hotel";
                location = "Morocco";
                budget = budget * 0.90;
            }
        }

        System.out.printf("%s - %s - %.2f", location, accommodation, budget);
     }
}
