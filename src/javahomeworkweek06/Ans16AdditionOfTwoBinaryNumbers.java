package javahomeworkweek06;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */

import java.util.Scanner;

public class Ans16AdditionOfTwoBinaryNumbers {
    //Declare main method.
    public static void main(String[] args) {

        //Define scanner statement
        Scanner bin = new Scanner(System.in);
        //Create a print statement
        System.out.print("Input first binary number : ");
        //Declare a variable to store a binary number.
        String a = bin.next();
        //Create a print statement
        System.out.print("Input second binary number : ");
        //Declare Second variable to store a binary number.//
        String b = bin.next();
        binary(a, b);

        //Close scanner statement
        bin.close();
    }


    //create a static method
    public static void binary(String a, String b) {
        //Define two variable to change binary value to integer value
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        //Define a variable to add to variable
        int z = (x + y);
        //Declare print statement with swapped variable.
        System.out.println("Sum of two binary numbers : " + Integer.toBinaryString(z));

    }

}
