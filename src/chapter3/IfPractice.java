package chapter3;

import java.util.Scanner;

public class IfPractice {

    public static  void  main(String[] arg){

        String username = "boluwatife";
        String password = "TifeEasypeasy";
        System.out.println("Enter username: ");
        Scanner scanner = new Scanner(System.in);
       String fName = scanner.nextLine();

        System.out.println("Enter password: ");
        String sName = scanner.nextLine();
        scanner.close();

       if(fName.equals(username) && sName.equals(password)){
           System.out.println("Welcome ");
       }
       else{
           System.out.println("Incorrect username/password");
       }

    }
}
