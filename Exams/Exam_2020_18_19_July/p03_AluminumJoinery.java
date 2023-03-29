package Exam_2020_18_19_July;

import java.util.Scanner;

public class p03_AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int joineryNumber = Integer.parseInt(scanner.nextLine());
        String joineryType = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0.0;
        double discount = 0.0;


        if (joineryType.equals("90X130")) {
            price = 110.00;
            if (joineryNumber > 60) {
                discount = 0.08;
            } else if (joineryNumber > 30) {
                discount = 0.05;
            }
        } else if (joineryType.equals("100X150")) {
            price = 140.00;
            if (joineryNumber > 80) {
                discount = 0.10;
            } else if (joineryNumber > 40) {
                discount = 0.06;
            }
        } else if (joineryType.equals("130X180")) {
            price = 190.00;
            if (joineryNumber > 50) {
                discount = 0.12;
            } else if (joineryNumber > 20) {
                discount = 0.07;
            }
        } else if (joineryType.equals("200X300")) {
            price = 250.00;
            if (joineryNumber > 50) {
                discount = 0.14;
            } else if (joineryNumber > 25) {
                discount = 0.09;
            }
        }

        double total = price * joineryNumber;
        double afterDiscount = total - total * discount;
        if (delivery.equals("With delivery")) {
            afterDiscount += 60;
        }

        if (joineryNumber < 10) {
            System.out.println("Invalid order");
        } else if (joineryNumber > 99) {
            afterDiscount = afterDiscount - afterDiscount * 0.04;
            System.out.printf("%.2f BGN", afterDiscount);
        } else if (joineryNumber >= 10 && joineryNumber <= 99) {
            System.out.printf("%.2f BGN", afterDiscount);
        }
    }
}
