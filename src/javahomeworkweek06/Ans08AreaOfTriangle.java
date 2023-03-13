package javahomeworkweek06;

/**
 * Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class Ans08AreaOfTriangle {
    //Declare a main method.
    public static void main(String[] args) {
        //create a scanner method.
        Scanner scanner = new Scanner(System.in);
        //Create a print statement for providing height of a triangle.
        System.out.print("Provide height in centimeter : ");
        //Create a variable for providing height
        double h = scanner.nextInt();
        //Declare print statement for providing width of the triangle
        System.out.print("Provide width in centimeter : ");
        //Create a variable for providing width
        double b = scanner.nextInt();
        //call static method into main method
        triangel(h, b);

        //Close scanner command
        scanner.close();
    }

    public static void triangel(double h, double b) {

        //Declare area of a triangle using a variable
        double area = ((h * b) / 2);
        //Declare printout statement
        System.out.println("Total area of triangle in centimeter is : " + area);

    }

}
