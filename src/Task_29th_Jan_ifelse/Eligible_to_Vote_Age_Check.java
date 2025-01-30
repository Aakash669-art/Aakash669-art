package Task_29th_Jan_ifelse;

import java.util.Scanner;

public class Eligible_to_Vote_Age_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }
}
