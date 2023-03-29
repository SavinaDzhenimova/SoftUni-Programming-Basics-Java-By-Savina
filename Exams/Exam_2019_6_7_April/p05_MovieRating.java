package Exam_2019_6_7_April;

import java.util.Scanner;

public class p05_MovieRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double averageRating = 0.0;
        String maxMovieTitle = "";
        String minMovieTitle = "";

        for (int i = 1; i <= n; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            if (rating > max) {
                max = rating;
                maxMovieTitle = movieName;
            }

            if (rating < min) {
                min = rating;
                minMovieTitle = movieName;
            }

            averageRating += rating;
        }

        double average = averageRating / n;
        System.out.printf("%s is with highest rating: %.1f%n", maxMovieTitle, max);
        System.out.printf("%s is with lowest rating: %.1f%n", minMovieTitle, min);
        System.out.printf("Average rating: %.1f%n", average);
    }
}
