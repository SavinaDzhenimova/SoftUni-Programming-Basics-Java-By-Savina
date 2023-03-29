package Exam_2019_20_21_April;

import java.util.Scanner;

public class p05_EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String maxColor = "";
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    red++;
                    if (red > max) {
                        max = red;
                        maxColor = color;
                    }
                    break;
                case "orange":
                    orange++;
                    if (orange > max) {
                        max = orange;
                        maxColor = color;
                    }
                    break;
                case "blue":
                    blue++;
                    if (blue > max) {
                        max = blue;
                        maxColor = color;
                    }
                    break;
                case "green":
                    green++;
                    if (green > max) {
                        max = green;
                        maxColor = color;
                    }
                    break;
            }
        }

        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s", max, maxColor);
    }
}
