package Task_1th_feb;

import java.util.Scanner;

public class Divisible_by_5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("It is divible by 5 and 11");
        }else {
            System.out.println("It is not divisible by 5 and 11");
        }
    }
}
