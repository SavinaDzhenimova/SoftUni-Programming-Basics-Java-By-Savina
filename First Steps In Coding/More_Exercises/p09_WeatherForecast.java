package More_Exercises;

import java.util.Scanner;

public class p09_WeatherForecast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String weather = scan.nextLine();
        if (weather.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}
