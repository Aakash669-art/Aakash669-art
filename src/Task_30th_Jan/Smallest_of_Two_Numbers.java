package Task_30th_Jan;

import java.util.Scanner;

public class Smallest_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the num1");
        int number1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the num2");
        int number2 = sc2.nextInt();
        if (number1 < number2) {
            System.out.println("Number 1 is smaller");
        } else {
            System.out.println("Number 2 is smaller");
        }
    }
}
