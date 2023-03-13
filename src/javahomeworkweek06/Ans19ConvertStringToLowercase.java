package javahomeworkweek06;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 */

import java.util.Scanner;

public class Ans19ConvertStringToLowercase {
    //create a main method.
    public static void main(String[] args) {
        //Create a scanner statement
        Scanner read = new Scanner(System.in);
        //create a print statement
        System.out.print("Enter given Uppercase string : ");
        //create a string variable to store the given sentence
        String a = read.nextLine();
        //call static method into main method
        character(a);

        //Close scanner statement.
        read.close();
    }

    //Create a  static method.
    public static void character(String a) {

        //create a statement with formula to change the stored statement into lowercase
        System.out.println("Characters changed to lowercase : " + a.toLowerCase());
    }
}