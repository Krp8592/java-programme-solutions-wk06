package javahomeworkweek06;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

import java.util.Scanner;

public class Ans13AvgOfThreeNumbers {
    //Declare a main method.
    public static void main(String[] args) {
        //create a scanner statement to store three value.
        Scanner in1 = new Scanner(System.in);
        //define print statement
        System.out.print("Input first value: ");
        //Define a variable to store value of first statement.
        double q = in1.nextDouble();
        //Declare a print statement
        System.out.print("Input second value: ");
        //Define a variable to store value of second statement
        double r = in1.nextDouble();
        //Declare next print statement
        System.out.print("Input third value: ");
        //Define a variable to store value of Third statement
        double s = in1.nextDouble();
        //call instance method in main method.
        Ans13AvgOfThreeNumbers obj = new Ans13AvgOfThreeNumbers();
        obj.avg(q, r, s);

        //Call scanner statement
        in1.close();
    }

    public void avg(double q, double r, double s) {
        //Declare a new variable to store the formula of finding the average of three value
        double x = ((q + r + s) / 3);
        //Define a print statement with the variable defined earlier.
        System.out.println(" Average of three input numbers : " + x);

    }

}
