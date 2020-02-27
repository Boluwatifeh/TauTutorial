package chapter6;

import java.util.Scanner;

public class practiceTests {
   static  int number1;
   static int number2;
 static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
       int firstNumber =firstNumber();
       int secondNumber = secondNumber();
       scanner.close();
        int totalSum = calculateSum(firstNumber, secondNumber);
        System.out.println("Sum is " + totalSum);
    }
    public static int firstNumber(){
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        return number1;
    }
    public static int secondNumber(){
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();
        return number2;

    }
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
