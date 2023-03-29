package Exam_Preparation_Part_One;

import java.util.Scanner;

public class p02_Bricks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bricksCount = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int bricksOneCourse = m * workers;
        double courses = bricksCount * 1.00 / bricksOneCourse;
        System.out.println(Math.ceil(courses));
    }
}
