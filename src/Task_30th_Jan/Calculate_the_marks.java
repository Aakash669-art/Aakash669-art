package Task_30th_Jan;

import java.util.Scanner;

public class Calculate_the_marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score");
        int score = sc.nextInt();
        String grade = "F";
        if(score>100){
            System.out.println("Enter value between 0 and 100");
            sc.close();
        }

        if (score >= 90 && score <= 100) {
            grade = "A+";
        } else if (score >= 80 && score <= 89) {
            grade = "A";
        }
        else if (score >= 70 && score <= 79) {
            grade = "B";
        }
        else if (score >= 60 && score <= 69) {
            grade = "C";
        } else if (score >= 50 && score <= 59) {
            grade = "D";
        } else if
        (score >= 40 && score <= 49) {
            grade = "E";
        }
        else {
            grade = "F";
        }
        System.out.println("Your grade is->" +grade);
    }
}
