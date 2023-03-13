package javahomeworkweek06;

/**
 * Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 */

public class Ans12ComputeSpecifiedExpression {
    //Define a main method.
    public static void main(String[] args) {
        //Call static method into main method
        expected();
    }

    public static void expected() {
        //Declare two variables to store value of two specified expression
        double v1 = (25.5 * 3.5 - 3.5 * 3.5);
        double v2 = (40.5 - 4.5);
        //Create a print statement for printing out result of the expressions.
        System.out.println("The output is : " + (v1 / v2));

    }
}
