package Exam_Preparation_Part_One;

import java.util.Scanner;

public class p10_RectangleWithStars {
    static String repeatStr(String strToRepeat,int count){
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < count; i++){
            text.append(strToRepeat);
        }
        return text.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int numRows = n;
        if (n % 2 == 0){
            numRows--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("%");
            System.out.print("%");
        }
        for (int i = 0; i < numRows; i++) {
            System.out.print("%");
            if (i == numRows / 2) {
                System.out.print(repeatStr(" ",n - 2));
                System.out.print("**");
                System.out.print(repeatStr(" ",n - 2));
            } else {
                System.out.print(repeatStr(" ",n * 2 - 2));
            }
            System.out.print("%");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("%");
            System.out.print("%");
        }
    }
}

