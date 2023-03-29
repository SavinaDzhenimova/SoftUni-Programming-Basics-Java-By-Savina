package Exam_2019_15_16_June;

import java.util.Scanner;

public class p01_SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double duration = Double.parseDouble(scanner.nextLine());

        double ads = duration * 0.20;
        double durationWithAds = duration + ads;
        double extraTime = seasons * 10;
        double totalTime = durationWithAds * episodes * seasons + extraTime;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, Math.floor(totalTime));
    }
}
