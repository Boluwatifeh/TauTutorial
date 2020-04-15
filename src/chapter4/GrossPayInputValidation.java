package chapter4;
/*
*WHILE LOOP
*Each store employee makes $15 an hour, write a program that allows the
* employee  to enter the number of hours worked for the week and do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public  static void main(String[] args){

        // Initialize known variables
        int rate = 15;
        int maxHours = 40;

        // Get unknown variables
        System.out.println("Enter amount of hours worked for the week:");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

      while (hoursWorked > maxHours){
          System.out.println("Try again, hours worked must be between 1 and 40 ");
          hoursWorked = scanner.nextDouble();
      }
      double gross = rate * hoursWorked;
      System.out.println("Salary is $" + gross);
    }
}
