package Task_1th_feb;

import java.util.Scanner;

public class Senior_Citizen_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age number");
        int age = sc.nextInt();
        if(age>0 && age<=12){
            System.out.println("child");
            }else if( age>=13 && age<= 19){
                System.out.println("Teenager");
            }else if( age>=20 && age<= 64){
                System.out.println("Adult");
            }else if(age >65) {
                System.out.println("Senior Citizen");
            } else{  // if user enters negative value of age
                System.out.println("Please enter a valid age value above zero.");
            }
        }
    }
