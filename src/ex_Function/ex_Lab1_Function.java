package ex_Function;

import java.util.Scanner;

public class ex_Lab1_Function {
    public static void main(String[] args) {

        main();
        int age1 = age();
        System.out.println("age->" + age1);
        sum(3, 4);
        String name1 = name("Aakash", "Kansal");
        System.out.println("The full name is->" + name1);

    }
    static void main() {

        System.out.println("Aakash");

    }

    static int age() {
        return 12;
    }

    static void sum(int a, int b) {

        System.out.println(a + b);

    }
    static String name(String firstname, String Lastname) {
        return firstname+" "+Lastname;
    }

}


