package Java_Book;

public class p12_BreakSum {
    public static void main(String[] args) {
        boolean hasToEnd = false;
        for (int i = 1; i <= 3; i++) {
            if (!hasToEnd) {
                for (int j = 3; j >= 1; j--) {
                    if (i + j == 2) {
                        hasToEnd = true;
                        break;
                    }
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
