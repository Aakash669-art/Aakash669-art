package Task_7_Feb;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int table = sc.nextInt();
        System.out.println("Enter the multiplication number");
        int range = sc.nextInt();
        int result = 0;

        for(int i=1; i<=range; i++)
         {
             result = table*i;
            System.out.println(table +"*"+i+"="+result);
        }
    }
}
