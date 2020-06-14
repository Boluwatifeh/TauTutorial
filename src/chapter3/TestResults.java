package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main (String[] args){


        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        char grade = 0;
        if(score >= 70 && score<=100){
            grade ='A' ;
        }
        else  if(score>=60 && score <= 69 ){
            grade = 'B';
        }
        else  if(score >=50 && score <=59 ){
            grade = 'C';
        }
        else  if(score>=40 && score <=49 ){
            grade ='D';
        }
        else if(score >=0 && score<=40 ){
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);
    }

}
