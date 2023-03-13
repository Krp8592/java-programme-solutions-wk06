package javahomeworkweek06;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Ans07ConvertTemperatureValue {
    //create a main method.
    public static void main(String[] args) {

        temperature();//Call static method
    }

    //Declare static method.
    public static void temperature() {
        //Print command to insert temperature Fahrenheit
        Scanner scanner = new Scanner(System.in);
        //create a scanner method to input temperature in Fahrenheit.
        System.out.print("Enter temperature in Fahrenheit : ");
        //Declare two variable one for input the data and second for converting,
        // formula of Fahrenheit to temperature
        double f = scanner.nextInt();
        double t = ((f - 32) * 5 / 9);
        //create a print statement for getting the final answer.
        System.out.println("Temperature in degree Celsius = " + t);
        //Close scanner program
        scanner.close();
    }

}
