package More_Exercises;

import java.util.Scanner;

public class p07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int overnightCount = Integer.parseInt(scanner.nextLine());
        double campPrice = 0.0;
        String sportType = "";


        if (season.equals("Winter")) {
            if (groupType.equals("girls")) {
                sportType = "Gymnastics";
                campPrice = overnightCount * 9.60 * studentsCount;
            } else if (groupType.equals("boys")) {
                sportType = "Judo";
                campPrice = overnightCount * 9.60 * studentsCount;
            } else if (groupType.equals("mixed")) {
                sportType = "Ski";
                campPrice = overnightCount * 10.00 * studentsCount;
            }
        } else if (season.equals("Spring")) {
            if (groupType.equals("girls")) {
                sportType = "Athletics";
                campPrice = overnightCount * 7.20 * studentsCount;
            } else if (groupType.equals("boys")) {
                sportType = "Tennis";
                campPrice = overnightCount * 7.20 * studentsCount;
            } else if (groupType.equals("mixed")) {
                sportType = "Cycling";
                campPrice = overnightCount * 9.50 * studentsCount;
            }
        } else if (season.equals("Summer")) {
            if (groupType.equals("girls")) {
                sportType = "Volleyball";
                campPrice = overnightCount * 15.00 * studentsCount;
            } else if (groupType.equals("boys")) {
                sportType = "Football";
                campPrice = overnightCount * 15.00 * studentsCount;
            } else if (groupType.equals("mixed")) {
                sportType = "Swimming";
                campPrice = overnightCount * 20.00 * studentsCount;
            }
        }

        if (studentsCount >= 50) {
            campPrice = campPrice * 0.50;
        } else if (studentsCount >= 20) {
            campPrice = campPrice * 0.85;
        } else if (studentsCount >= 10) {
            campPrice = campPrice * 0.95;
        }

        System.out.printf("%s %.2f lv.", sportType, campPrice);
    }
}
