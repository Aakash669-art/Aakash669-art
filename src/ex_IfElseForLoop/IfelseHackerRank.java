package ex_IfElseForLoop;

import java.util.Scanner;

public class IfelseHackerRank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score");

        int score = sc.nextInt();
        char grade = 'F';

        if (score >= 90 && score <= 10) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        }
           else if (score >= 70 && score <= 79) {
            grade = 'C';
        }
                else if (score >= 60 && score <= 69) {
            grade = 'D';
        }
                    else{
                        grade = 'F';
                    }
                    System.out.println("Your grade is->" +grade);
                }
            }
