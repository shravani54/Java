// MathOperationsExample.java

import java.lang.Math; // Importing the Math class

// Creating the MathOperations package (simulation in a single file)
public class MathOperationsExample {

    // Class for performing Floor operation
    static class FloorOperation {
        public static double performFloor(double number) {
            return Math.floor(number); // Returns the largest integer less than or equal to the number
        }
    }

    // Class for performing Ceil operation
    static class CeilOperation {
        public static double performCeil(double number) {
            return Math.ceil(number); // Returns the smallest integer greater than or equal to the number
        }
    }

    // Class for performing Round operation
    static class RoundOperation {
        public static long performRound(double number) {
            return Math.round(number); // Rounds the number to the nearest integer
        }
    }

    // Main method to test the Math operations
    public static void main(String[] args) {
        double number1 = 8.75;
        double number2 = 5.35;
        double number3 = -2.45;

        // Using FloorOperation
        System.out.println("Floor of " + number1 + " is: " + FloorOperation.performFloor(number1));
        System.out.println("Floor of " + number2 + " is: " + FloorOperation.performFloor(number2));
        System.out.println("Floor of " + number3 + " is: " + FloorOperation.performFloor(number3));

        // Using CeilOperation
        System.out.println("Ceil of " + number1 + " is: " + CeilOperation.performCeil(number1));
        System.out.println("Ceil of " + number2 + " is: " + CeilOperation.performCeil(number2));
        System.out.println("Ceil of " + number3 + " is: " + CeilOperation.performCeil(number3));

        // Using RoundOperation
        System.out.println("Round of " + number1 + " is: " + RoundOperation.performRound(number1));
        System.out.println("Round of " + number2 + " is: " + RoundOperation.performRound(number2));
        System.out.println("Round of " + number3 + " is: " + RoundOperation.performRound(number3));
    }
}
