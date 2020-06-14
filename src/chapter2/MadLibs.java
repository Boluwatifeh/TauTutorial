package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args){

        //1.) Ask the user for the season of the year
        System.out.println("Enter the season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        //2.) Ask the user for a whole number
        System.out.println("Enter a whole number");
        Scanner scanner1 = new Scanner(System.in);
        int wholeNumber = scanner1.nextInt();

        //3.)Ask the user for an adjective
        System.out.println("Enter an adjective");
        Scanner scanner2 = new Scanner(System.in);
        String adjective = scanner2.next();


        //4.)Complete the sentence using the provided information
        System.out.println("On a " + adjective + season + " day, i drink a minimum of " + wholeNumber  + " cups of coffee" );
    }
}
