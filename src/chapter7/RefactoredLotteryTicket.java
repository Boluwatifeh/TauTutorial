package chapter7;

import java.util.Random;
/*
 In this exercise, the lottery ticket program was refactored so as not to
 repeat a value twice in the array using the sequential search algorithm
  */

public class RefactoredLotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket =  generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i=0; i<LENGTH; i++){
            int randomNumber;

            /*
             * Generate random number then check to make sure it doesn't exist in the array,
             * if it does, regenerate and search again.
             */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket, randomNumber));

            // number is unique if we get here
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array The array we're searching through
     * @param numberToSearchFor The value to search for
     * @return true if found and false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){
        /*
          Here is an enhanced loop, it
          iterates through array and each time assigns current element to value
         */
         for (int value : array){
             if (value==numberToSearchFor){
                 return true;
             }
         }
         /*
           If we've reached this point, then the array was
           searched and value was not found
          */
         return false;
    }

    public static void printTicket(int[] ticket){
        for (int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
