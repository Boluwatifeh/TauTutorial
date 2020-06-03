package chapter5;

import java.util.Scanner;

public class GreetingsLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Hello there," + name);

            System.out.println("Do you want to try again, true / false ? ");
            again = scanner.nextBoolean();

        }while (again);
        scanner.close();
    }
}
