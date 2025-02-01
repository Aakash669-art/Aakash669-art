package Task_30th_Jan;

import java.util.Scanner;

public class Largest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the num1");
        int number1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the num2");
        int number2= sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the num3");
        int number3= sc2.nextInt();
        if((number1>number2)&&(number1>number3)){
            System.out.println("Number 1 is max");
        }else if (((number2>number1)&&(number2>number3))) {
            System.out.println("Number 2 is max");
        }
        else{
            System.out.println("Number 3 is max");
        }
    }
}


