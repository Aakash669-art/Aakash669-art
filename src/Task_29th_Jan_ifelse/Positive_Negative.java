package Task_29th_Jan_ifelse;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(a >0){
            System.out.println("This is a  positive number");
        } else if (a==0) {
            System.out.println("This is equal to zero");
        }else{

            System.out.println("This is a negative number");
        }
    }
}
