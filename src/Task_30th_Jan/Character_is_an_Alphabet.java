package Task_30th_Jan;

import java.util.Scanner;

public class Character_is_an_Alphabet {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if(ch>='A' && ch<='Z' || ch>='a' && ch <='z'){
            System.out.println("IT is an alphabet");
        }else {
            System.out.println("It is not alphbet");
        }
    }

}
