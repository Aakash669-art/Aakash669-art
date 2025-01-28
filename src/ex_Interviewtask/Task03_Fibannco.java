package ex_Interviewtask;

import java.util.Scanner;

public class Task03_Fibannco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i=1; i<=n; i++){
            int next  = a+b;
            a = b;
            b = next;
        }
        System.out.println("The series of " +n+ " is " +a );
    }
}
