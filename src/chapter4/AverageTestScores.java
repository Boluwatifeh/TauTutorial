package chapter4;

import java.util.Scanner;

/*
* NESTED LOOPS:
* Find the average of each students test score
 */
public class AverageTestScores {

    public static void main(String[] args) {
        // initialize what we know
        int number0fStudents = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);
        // process all students
        for (int i=0; i< number0fStudents; i++){
             double total = 0;
            for (int j=0; j<numberOfTests; j++){
                System.out.println("Enter the score for test # " +(j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("The total average of student #" + (i+1) + " is " + average);
        }
        scanner.close();
    }
}
