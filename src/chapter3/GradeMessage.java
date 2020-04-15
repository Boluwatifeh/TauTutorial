package chapter3;

import java.util.Scanner;

public class GradeMessage {
     public  static void main(String[] args){

         System.out.println("Enter your grade: ");
         Scanner scanner = new Scanner(System.in);
         String grade =  scanner.next();
         scanner.close();

         String message;

         switch (grade){
             case "A":
                 message = "Excellent!";
                 break;
             case "B":
                 message = "Well done, you did great";
                 break;
             case  "C":
                 message = "Nice  performance!";
                 break;
             case "D":
                 message = "Poor performance, try harder ";
                 break;
             case "F":
                 message = "Uh oh!";
                 break;
             default:
                 message = "Error, invalid grade";
                 break;
         }
         System.out.println(message);
     }
}
