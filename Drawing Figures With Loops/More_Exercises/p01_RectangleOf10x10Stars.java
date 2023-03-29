package More_Exercises;

public class p01_RectangleOf10x10Stars {
    public static void main(String[] args) {

        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
