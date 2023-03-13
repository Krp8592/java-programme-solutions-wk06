package javahomeworkweek06;

/**
 * Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Ans09UppercaseToLowercase {
        //Declare main method.
    public static void main(String[] args) {
        //create a scanner program.
        Scanner read = new Scanner(System.in);
        //create a printout statement
        System.out.print("Enter any Uppercase Character : ");
        // create a variable to store sentence.
        String a = read.next();
        //Call instance method inside main method.
        Ans09UppercaseToLowercase obj1 = new Ans09UppercaseToLowercase();
        obj1.character(a);

        //Close the scanner program.
        read.close();
    }

    //Crate an instance method
    public void character(String a){
        //define a statement containing function to change the uppercase into lower case.
        System.out.println("Characters changed to lowercase : " + a.toLowerCase());


    }


}
