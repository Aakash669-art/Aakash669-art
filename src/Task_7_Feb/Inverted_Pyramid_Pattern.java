package Task_7_Feb;

public class Inverted_Pyramid_Pattern {
    public static void main(String[] args) {
        int n = 9;
        for (int i = n; i >= 1; i -= 2) {
            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}