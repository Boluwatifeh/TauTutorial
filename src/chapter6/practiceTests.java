package chapter6;

import java.util.Scanner;

public class practiceTests {

 static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
       int firstNumber =firstNumber();
       int secondNumber = secondNumber();
       scanner.close();
        int totalSum = calculateSum(firstNumber, secondNumber);
        System.out.println("Sum is " + totalSum);
    }
    public static int firstNumber(){
        System.out.println("Enter first number: ");
        return scanner.nextInt();
    }
    public static int secondNumber(){
        System.out.println("Enter second number: ");
        return scanner.nextInt();

    }
    public static int calculateSum(int num1, int num2){
        return num1 + num2;
    }
}
