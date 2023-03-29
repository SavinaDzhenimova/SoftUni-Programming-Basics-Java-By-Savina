package Book;

import java.util.Scanner;

public class p06_SquareOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int row=1; row <= n; row++){
            System.out.print("*");
        }
        System.out.print("\n");
        for (int column = 1; column <= n - 2; column++){
            for (int row = 1; row <= n; row++){
                if(row == 1||row == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
        for(int row=1; row <= n; row++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
