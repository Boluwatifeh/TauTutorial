package chapter5;
 /*
 *Variable scope
 *write an instant credit check program that approves
 *anyone who makes more than $25,000 and has a credit score
 *of 700 or better. Reject all others.
  */

import java.util.Scanner;

public class InstantCreditCheck {

    public static void main(String args []){

        // initialize what we know
        int requiredSalary = 25000;
        int requiredCreditScore = 700;

        // Get what we don't know
        System.out.println("Enter amount of salary earned: ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        System.out.println("Enter amount of credit score : ");
        int creditScore = scanner.nextInt();
         scanner.close();

        // Check if the user is qualified
        if (salary >= requiredSalary && creditScore >= requiredCreditScore ){
            System.out.println("Congratulations, you're qualified for the loan");
        }
        else{
            salary = requiredSalary - salary;
            creditScore = requiredCreditScore - creditScore;
            System.out.println("You are short of " + creditScore
            + " and must have earned " +"$"+ salary + " more");
        }
        // Notify the user

    }
}
