package chapter7;

import java.util.Scanner;

/*
 * A program that allows user to enter any number
 * of grades and provide them with average score,
 * as well as the lowest score.
 */
public class Grades {

    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the amount number of grades: ");
        grades = new int[scanner.nextInt()];

        getGrades();
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }

    private static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade # " + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    public static int getHighest(){
        int highest = grades[0];
        for (int grade : grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for (int grade : grades){
            if (grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}
