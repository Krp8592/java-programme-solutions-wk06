package javahomeworkweek06;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Ans06AreaOfCircle {
    // Create a main method.
    public static void main(String[] args) {
        //Declare a scanner method to give an input of radius of a circle
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value of Radius in centimeter : ");
        //Create a variable for defining a radius value
        double r = scanner.nextDouble();
        //create an object for calling instance method in to main method.
        Ans06AreaOfCircle obj = new Ans06AreaOfCircle();
        obj.circle1(r);//call instance method

        //end scanner method
        scanner.close();
    }

    //Declare an instance method to provide formula of area of a circle
    public void circle1(double r) {
        // Create a variable for defining formula of area of circle
        double area = 3.14 * r * r;
        //Declare printout statement
        System.out.println("Area of the circle in centimeter : " + area);


    }

}


