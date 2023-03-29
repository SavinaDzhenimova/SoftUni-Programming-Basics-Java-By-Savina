package Exam_2019_15_16_June;

import java.util.Scanner;

public class p04_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int income = 0;
        boolean isFull = false;

        while (!command.equals("Movie time!")) {
            int people = Integer.parseInt(command);

            if (people > hallCapacity) {
                isFull = true;
                break;
            }
            int price = people * 5;

            if (people % 3 == 0) {
                price -= 5;
            }
            hallCapacity -= people;
            income += price;
            command = scanner.nextLine();
        }

        if (command.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", hallCapacity);
        }
        if (isFull) {
            System.out.println("The cinema is full.");
        }
        System.out.printf("Cinema income - %d lv.%n", income);
    }
}
