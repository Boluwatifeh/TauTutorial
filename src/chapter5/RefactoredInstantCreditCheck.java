package chapter5;

import java.util.Scanner;

public class RefactoredInstantCreditCheck {

    // initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        int salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();


        // Check if the user is qualified
        boolean qualified = isUserQualified(salary, creditScore);
        // Notify the user
        notifyUser(qualified);
    }

    public static int getSalary() {
        System.out.println("Enter amount of salary earned: ");
        int salary = scanner.nextInt();
        return salary;

    }

    public static int getCreditScore() {
        System.out.println("Enter amount of credit score : ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int salary , int creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScore  ) {
//creditScore >= requiredCreditScore
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congratulations, you're qualified for the loan");
        } else {
            System.out.println("Sorry, you're declined!");
        }
    }
}