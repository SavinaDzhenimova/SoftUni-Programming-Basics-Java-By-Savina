package Exam_2019_20_21_April;

import java.util.Scanner;

public class p01_EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());

        double eggsPaint = eggs * 12 * 0.15;
        double total = easterBread * 3.20 + eggs * 4.35 + cookies * 5.40 + eggsPaint;
        System.out.printf("%.2f", total);
    }
}
