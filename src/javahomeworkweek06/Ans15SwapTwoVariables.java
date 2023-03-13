package javahomeworkweek06;

/**
 * Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class Ans15SwapTwoVariables {

    //Define a main method.
    public static void main(String[] args) {
        //define a scanner statement.
        Scanner swap = new Scanner(System.in);
        //create a print statement.
        System.out.print(" First variable : ");
        //define a variable.
        int a = swap.nextInt();
        //define a print statement
        System.out.print(" Second variable : ");
        //declare a second variable
        int b = swap.nextInt();
        //call instance in main method.
        Ans15SwapTwoVariables obj = new Ans15SwapTwoVariables();
        obj.v1(a, b);

        //close scanner statement.
        swap.close();
    }

    //Crate an instance method.
    public void v1(int a, int b) {
        //creat a new variable and store value of each variable.
        int c = a;
        a = b;
        b = c;
        //Declare a print statement for first swapped value.
        System.out.println(" New Swapped First  variable :  " + a);
        //declare a print statement for second swapped value.
        System.out.println(" New Swapped second variable : " + b);
    }

}
