package More_Exercises;

import java.util.Scanner;

public class p02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double collectedMoney = 0.0;

        switch (trace) {
            case "trail":
                collectedMoney = juniors * 5.50 + seniors * 7;
                break;
            case "cross-country":
                collectedMoney = juniors * 8 + seniors * 9.50;
                if (juniors + seniors >= 50) {
                    collectedMoney = collectedMoney * 0.75;
                }
                break;
            case "downhill":
                collectedMoney = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                collectedMoney = juniors * 20 + seniors * 21.50;
                break;
        }

        System.out.printf("%.2f", collectedMoney * 0.95);
    }
}
