import java.util.Scanner;

public class p13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figure = scan.nextLine();

        if (figure.equals("square")) {
            double squareA = Double.parseDouble(scan.nextLine());
            double squareArea = squareA * squareA;
            System.out.printf("%.3f", squareArea);
        } else if (figure.equals("rectangle")) {
            double rectangleA = Double.parseDouble(scan.nextLine());
            double rectangleB = Double.parseDouble(scan.nextLine());
            double rectangleArea = rectangleA * rectangleB;
            System.out.printf("%.3f", rectangleArea);
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scan.nextLine());
            double circleArea = Math.PI * r * r;
            System.out.printf("%.3f", circleArea);
        } else if (figure.equals("triangle")) {
            double triangleA = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            double triangleArea = triangleA * h / 2;
            System.out.printf("%.3f", triangleArea);
        }
    }
}
