package javahomeworkweek06;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */

import java.util.Scanner;

public class Ans10MultiplicationTable {
    //Declare main method.
    public static void main(String[] args) {

        //Declare a scanner program to store the value of multiplication table.
        Scanner table = new Scanner(System.in);
        //Create a printout statement.
        System.out.println("Enter a multiplication  number : ");
        //Create a variable to store the value of multiplication table
        int a = table.nextInt();
        //Call static method to main method from the class
        multiplication(a);

        //Close scanner programme.
        table.close();
    }

    public static void multiplication(int a) {

        //Create printout statement defining the formula of multiplication table up to 10.
        System.out.println(a + " x " + 1 + " = " + (a * 1));
        System.out.println(a + " x " + 2 + " = " + (a * 2));
        System.out.println(a + " x " + 3 + " = " + (a * 3));
        System.out.println(a + " x " + 4 + " = " + (a * 4));
        System.out.println(a + " x " + 5 + " = " + (a * 5));
        System.out.println(a + " x " + 6 + " = " + (a * 6));
        System.out.println(a + " x " + 7 + " = " + (a * 7));
        System.out.println(a + " x " + 8 + " = " + (a * 8));
        System.out.println(a + " x " + 9 + " = " + (a * 9));
        System.out.println(a + " x " + 10 + " = " + (a * 10));


    }
}
