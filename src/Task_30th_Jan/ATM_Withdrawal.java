package Task_30th_Jan;

import java.util.Scanner;

public class ATM_Withdrawal {
    public static void main(String[] args) {
        int fa = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int wd = sc.nextInt();
        if((wd>0) && (wd%100==0) && (wd<fa)) {
            System.out.println("withdraw money is this->" + wd);
            int Update_amount = fa - wd;
            System.out.println("Update amount is " + Update_amount);
        }else if(wd%100!=0){
            System.out.println("Please enter the amount in the multiples of 100");
        }else if(wd > fa){
            System.out.println("Sorry, do not have sufficient balance in your account to withdraw the entered amount");
        } else if (wd<=0) {
            System.out.println("Please enter valid amount details to withdraw");
    }
}
}
