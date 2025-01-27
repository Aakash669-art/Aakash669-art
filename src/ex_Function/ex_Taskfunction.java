package ex_Function;

import java.util.Scanner;

public class ex_Taskfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 ");
        int a = 0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();

        } else {
            System.out.println("Enter the integer value ");
            System.exit(0);
        }
        System.out.println("Enter the num2");
        int b = sc.nextInt();
        int result_add = add(a, b);
        System.out.println(result_add);
        int result_mult = mult(3, 5);
        System.out.println(result_mult);
        int result_sub = sub(3, 5);
        System.out.println(result_sub);
        int result_div = div(3, 5);
        System.out.println(result_div);
        System.out.println("Enter the num1 ");


        int d = sc.nextInt();
        System.out.println("Enter the num2");
        int c = sc.nextInt();
        int result_mod = mod(c, d);
        System.out.println(result_mod);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int mult(int a, int b) {
        return a * b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mod(int c, int d) {
        if (d == 0) {
            System.out.println("It is not possible");
        }
        return c % d;
    }
}
