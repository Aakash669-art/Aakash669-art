package Task_7_Feb;

import java.util.Scanner;

public class Number_is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("the number is not prime");
        } else {
            System.out.println("the number is  prime");
        }
    }
}