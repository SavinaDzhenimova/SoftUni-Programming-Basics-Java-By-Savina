package Exam_2019_9_10_March;

import java.util.Scanner;

public class p01_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tennisRacket = Double.parseDouble(scanner.nextLine());
        int tennisRacketsCount = Integer.parseInt(scanner.nextLine());
        int sneakersCount = Integer.parseInt(scanner.nextLine());

        double sneakers = (1 / 6.0) * tennisRacket;
        double tennisRacketsPrice = tennisRacket * tennisRacketsCount;
        double sneakersPrice = sneakers * sneakersCount;
        double otherEquipment = (tennisRacketsPrice + sneakersPrice) * 0.20;
        double total = tennisRacketsPrice + sneakersPrice + otherEquipment;

        double paidByDjokovic = (1 / 8.0) * total;
        double paidBySponsors = (7 / 8.0) * total;
        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(paidByDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(paidBySponsors));
    }
}
