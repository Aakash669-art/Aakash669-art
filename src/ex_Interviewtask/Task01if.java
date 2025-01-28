package ex_Interviewtask;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task01if {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = sc.nextInt();
        if(a%4==0)
        {
            System.out.println("It is a leap years");
        }else {
            System.out.println("It is not a leap year");
        }
    }
}
