package Task_30th_Jan;

import java.util.Scanner;

public class Triangle_Three_Side {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a side");
        int a = sc.nextInt();
        System.out.println("Enter the b side");
        int b = sc.nextInt();
        System.out.println("Enter the c side");
        int c = sc.nextInt();
        if(a==b && b==c){
            System.out.println("it is valid triangle");
        }else {
            System.out.println("this is not a valid triangle");
        }
    }

}
