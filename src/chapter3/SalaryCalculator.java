package chapter3;

import java.util.Scanner;

/*
IF STATEMENT
all salespeople get a payment of $1000 a week
Salespeople who exceed 10 sales gets a bonus of $250
 */

public class SalaryCalculator {

    public static void main(String args[]){

        //initialize the variables
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get values for the unknown
        System.out.println("Enter amount of sales employee made in a week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        // use the if statement for salespeople who makes more than 10 sales
        if(sales > quota){
            salary = salary + bonus;

        }

        //output
        System.out.println("Your salary is $" + salary);

    }
}
