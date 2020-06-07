package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        double area = calculator.calculateArea(kitchen, bathroom);
        System.out.println("Total area: " + area);
        calculator.scanner.close();
    }

    private double calculateArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    private Rectangle getRoom() {
        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();
        Rectangle room = new Rectangle();
        room.setLength(length);
        room.setWidth(width);
        return room;
    }
}
