package javahomeworkweek06;

import java.util.Scanner;

/**
 * A calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.
 */

public class Ans05CalculatorProgram {

    public static void main(String[] args) {
        //Create scanner method to input numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Input first combination of numbers :  ");
        float value1 = scanner.nextFloat();//Create a variable for input
        System.out.print(" Input second combination of numbers : ");
        float value2 = scanner.nextFloat();//Create second variable for input
        System.out.println(" Answers of different Calculator programs :- ");
        //Declare an object for calling instance method(division)
        Ans05CalculatorProgram obj = new Ans05CalculatorProgram();
        obj.division(value1, value2);
        //Declare second object for calling instance method(multiplication)
        Ans05CalculatorProgram obj1 = new Ans05CalculatorProgram();
        obj1.multiplication(value1, value2);
        //call static method to main method
        subtraction(value1, value2);
        //call static method to main method
        addition(value1, value2);

        scanner.close();
    }


    // Create a static method for Subtraction.
    public static void subtraction(float value1, float value2) {
        float subtraction = value1 - value2;
        System.out.println("Result of Subtraction : " + subtraction);
    }

    // Declare a static method for addition
    public static void addition(float value1, float value2) {
        float addition = value1 + value2;
        System.out.println("Result of addition : " + addition);
    }

    // Declare an instance method for multiplication
    public void multiplication(float value1, float value2) {
        float multiplication = value1 * value2;
        System.out.println("Result of multiplication : " + multiplication);
    }

    // Declare an instance method for Division
    public void division(float value1, float value2) {
        float division = value1 / value2;
        System.out.println("Result of division : " + division);
    }
}