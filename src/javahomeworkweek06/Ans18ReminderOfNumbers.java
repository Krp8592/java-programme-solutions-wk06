package javahomeworkweek06;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 */

import java.util.Scanner;

public class Ans18ReminderOfNumbers {
    //Declare a main method
    public static void main(String[] args) {
        //Define a scanner statement to get the input of a first number.
        Scanner sc = new Scanner(System.in);
        //Declare a print statement
        System.out.print("Input first number : ");
        //Declare a variable to store the first number
        int a = sc.nextInt();
        //Create a print statement
        System.out.print("Input second number : ");
        //Create a variable to store the value of second variable.
        int b = sc.nextInt();
        sum(a, b);

        //Close scanner statement.
        sc.close();
    }

    //Create a static method
    public static void sum(int a, int b) {
        //create variables to store formula of division, addition, etc...
        int q = a + b;
        int r = a - b;
        int s = a * b;
        int t = a / b;
        int x = a % b;
        //Declare print statements with variables.
        System.out.println(" The out put of methods : ");
        System.out.println(a + " + " + b + " = " + q);
        System.out.println(a + " - " + b + " = " + r);
        System.out.println(a + " x " + b + " = " + s);
        System.out.println(a + " / " + b + " = " + t);
        System.out.println(a + " mod " + b + " = " + x);

    }
}
