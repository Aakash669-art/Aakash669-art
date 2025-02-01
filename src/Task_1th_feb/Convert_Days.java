package Task_1th_feb;

import java.util.Scanner;

public class Convert_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int day = sc.nextInt();
       int  years = day/365 , months = (day%365)/30  , days = (day%365)%30;
        System.out.println("conersion "+day+ " is " +years+ " years "+months+" months "+days+" day ");
    }
}
