package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args){

        // Initialize what we know

        int salaryQuota = 30000;
        int yearsQuota = 2;

        // Get what we don't know

        System.out.println("Enter the amount of your salary earned: ");
        Scanner scanner = new Scanner(System.in);
        double salaryEarned = scanner.nextDouble();

        System.out.println("Enter the amount of years worked: ");
        int years = scanner.nextInt();

        // Make decision

        if(salaryEarned >= salaryQuota ) {
            if (years >= yearsQuota) {
                System.out.println("You're qualified for the loan");
            }
            else {
                System.out.println("Sorry, you must have worked at your current job for " + yearsQuota + " years");
            }
        }
            else{
                System.out.println("Sorry, you must have earned at least $" + salaryQuota);
            }
        }


}
