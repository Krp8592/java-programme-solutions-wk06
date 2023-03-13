package javahomeworkweek06;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 */

import java.util.Scanner;

public class Ans17ConvertDecimalNumberToBinary {

    //Declare a main method.
    public static void main(String[] args) {
        //Define a scanner statement to store a decimal number.
        Scanner sc = new Scanner(System.in);
        //Define a print statement.
        System.out.print("Input a Decimal Number : ");
        //create a variable to store the value of decimal number
        int a = sc.nextInt();
        //Call instance method into main method.
        Ans17ConvertDecimalNumberToBinary obj = new Ans17ConvertDecimalNumberToBinary();
        obj.binary(a);

        //Close scanner statement
        sc.close();
    }

    //create an instance method.
    public void binary(int a) {

        //create a print statement with changed value of decimal number to binary number
        System.out.println("Binary number is : " + Integer.toBinaryString(a));
    }
}
