package ex_Interviewtask;

import java.util.Scanner;

public class Task02_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial");
        int n = sc.nextInt();
        int result = 1;
        for( int i=1; i<=n; i++){
            result = result*i;
    }
        System.out.println("Factorial of " + n + " is ->"+result);
    }
}
