package chapter3;

import java.util.Scanner;

/*
IF ELSE STATEMENT
All salespeople are expected to make at least 10 sales per week
For those who do, they get a congratulatory message
For those who don't, they are informed of how many sales they are short of
 */
public class QuotaCalculator {

    public static void main(String args[]){

        int quota = 10;

        System.out.println("Enter the amount of sales made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if(sales >= quota){
           System.out.println("Congratulations ");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("you were short of " + salesShort + " sales");
        }


    }
}
