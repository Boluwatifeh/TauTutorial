package chapter5;

/*
* CALCULATE THE FINAL TOTAL OF SOMEONES PHONE BILL
* ALLOW THE OPERATOR TO INPUT THE PLAN FEE
* CHARGE THE USER 0.25 FOR EVERY MINUTE THEY WERE OVER THEIR PLAN, AMD 15% TAX
* ON THE SUBTOTAL
* CREATE SEPARATE METHODS TO  CALCULATE THE TAX, OVERAGE FEES AND FINAL TOTAL.
* PRINT THE ITEMIZED BILL.
 */
import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // initialize what we know
        double chargesPerMinute = 0.25;
        double subTotalTax = 15;
        // get what we dont know
        double planFee =  enterPlanFee();
        int overageMinutes =  enterOverageMinutes();
        double fees  = overageFees(chargesPerMinute, overageMinutes);
        double tax =  calculateTax(planFee, fees, subTotalTax);
        double total = finalTotal(planFee, fees, tax);
        statement(planFee,fees, tax, total);

    }

    private static void statement(double planFee, double fees, double tax, double total) {
        System.out.println("Phone Bill Statement ");
        System.out.println("plan: " + planFee);
        System.out.println("Overage: " + fees);
        System.out.println("Tax: " + tax);
        System.out.println("Total "+ total);
    }

    private static double finalTotal(double planFee, double fees, double tax) {
        return planFee + fees + tax;
    }

    private static double calculateTax(double planFee, double fees, double subTotalTax) {
        return (planFee + fees) / 100 * subTotalTax;
    }

    private static double overageFees(double chargesPerMinute, double overageMinutes) {
        return chargesPerMinute * overageMinutes;
    }

    private static int enterOverageMinutes() {
        System.out.println("Enter overage minutes: ");
        return scanner.nextInt();
    }

    public static double enterPlanFee(){
        System.out.println("Enter base cost of the plan: ");
        return scanner.nextDouble();
    }

}
