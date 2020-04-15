package chapter3;

import java.util.Scanner;

public class NairaGame {
    public static void main(String[] args){

        int naira = 100;

         System.out.println("Enter the amount of kobo: ");
        Scanner scanner = new Scanner(System.in);
        double kobo = scanner.nextDouble();

       if(kobo == naira )
           System.out.println("Congratulations, you win. 100.00k is #1");

       else if(kobo < naira){
           double shorts = naira - kobo;
           System.out.println("Sorry, you lose, " + shorts + "k" + " is not up to #1");
       }
       else if(kobo > naira){
           double max = kobo - naira;
           System.out.println("You lose, you were more than #1 by " + max + "k");
       }
    }
}
