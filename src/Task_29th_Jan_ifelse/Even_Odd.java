package Task_29th_Jan_ifelse;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("This is a even number");
        }else {
            System.out.println("This is a odd number");
        }
    }
}
