package chapter4;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // the loop prints out the name entered 3 times
        for (int i=0; i<3; i++){
            System.out.println("Your name is " +name);
        }
        scanner.close();
    }
}
