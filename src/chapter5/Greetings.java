package chapter5;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args){

            System.out.println("Enter your name: ");
            Scanner scanner = new Scanner(System.in);
            // String name = scanner.next();  the next method only prints out a single string
            String name1 = scanner.nextLine();
            greetUser(name1);
    }

    public static void greetUser(String name){
       System.out.println("Hello there, " + name);
    }

}
