package More_Exercises;

import java.util.Scanner;

public class p06_FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int magnoliasNum = Integer.parseInt(scan.nextLine());
        int hyancinthsNum = Integer.parseInt(scan.nextLine());
        int rosesNum = Integer.parseInt(scan.nextLine());
        int cactiNum = Integer.parseInt(scan.nextLine());
        double giftPrice = Double.parseDouble(scan.nextLine());

        double totalPrice = magnoliasNum * 3.25 + hyancinthsNum * 4 + rosesNum * 3.5 + cactiNum * 8;
        double profit = totalPrice - (totalPrice * 0.05);

        if (profit >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(profit - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - profit));
        }
    }
}
