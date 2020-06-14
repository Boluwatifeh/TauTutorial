package chapter6;

public class HomeAreaCalculator {

    public static void main(String[] args){

        /**************
         *RECTANGLE 1
         *************/
        Rectangle room1 = new Rectangle();// method1: using the default constructor
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /**************
         *RECTANGLE 2
         *************/
        Rectangle room2 = new Rectangle(30, 75 );// method 2: setting the fields by passing them as parameters
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of the two rooms: " + totalArea);


    }
}
