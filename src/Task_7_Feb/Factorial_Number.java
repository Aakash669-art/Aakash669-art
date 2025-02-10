package Task_7_Feb;

import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int factorial = sc.nextInt();
        int result = 1;
        for(int i=1; i<=factorial; i++){
            result = result*i;
        } System.out.println("Factorial "+factorial+ " is "+result);
    }
}
