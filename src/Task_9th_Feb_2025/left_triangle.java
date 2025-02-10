package Task_9th_Feb_2025;

public class left_triangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n; i>=1; i--){
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
