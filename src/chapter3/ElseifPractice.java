package chapter3;

import java.util.Scanner;

public class ElseifPractice {

    public static void main(String[] args){

        // Ask user for their test score
        System.out.println("Enter your test score: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        char grade;
        // implement elseif statement to evaluate the corresponding grade
        if(score < 45){
            grade = 'F';
        }
        else if(score < 55){
            grade = 'D';
        }
        else if(score < 65){
            grade ='C';
        }
        else if(score < 70){
            grade = 'B';
       }
        else{
            grade = 'A';
        }

        // Print out the student's grade
        System.out.println("Your grade is: " + grade );
    }
}
