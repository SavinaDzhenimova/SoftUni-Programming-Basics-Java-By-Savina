package Lab;

import java.util.Scanner;

public class p08_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double dogPrice = dogFood * 2.5;
        double catPrice = catFood * 4;
        double sum = dogPrice + catPrice;
        System.out.println(sum);
    }
}
