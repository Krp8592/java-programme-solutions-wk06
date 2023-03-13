package javahomeworkweek06;

/**
 * Write a Java program to display the following pattern.
 * Sample Pattern :
 * J    a   v     v   a
 * J   a a   v   v   a a
 * J   J  aaaaa   V V   aaaaa
 * J J  a     a   V   a     a
 */

import java.util.Scanner;

public class Ans11DisplayPattern {
    //Declare main method.
    public static void main(String[] args) {
        // create a scanner programme tp store some value in programme
        Scanner scanner = new Scanner(System.in);
        //declare a statement for defining a program.
        System.out.println("Sample Pattern : ");
        //Call instance method in to main method.
        Ans11DisplayPattern obj = new Ans11DisplayPattern();
        obj.pattern();

        //Close scanner method.
        scanner.close();
    }

    //declare an instance method.
    public void pattern() {
        //declare statements for printing java pattern.
        System.out.println("           jjjjjjjjjjjjj            aaaa           vv                    vv           aaaa          ");
        System.out.println("                 jj                aa  aa           vv                  vv           aa  aa         ");
        System.out.println("                 jj               aa    aa           vv                vv           aa    aa        ");
        System.out.println("                 jj              aa      aa           vv              vv           aa      aa       ");
        System.out.println("                 jj             aa        aa           vv            vv           aa        aa      ");
        System.out.println("                 jj            aa          aa           vv          vv           aa          aa     ");
        System.out.println("   jj            jj           aa            aa           vv        vv           aa            aa    ");
        System.out.println("   jj            jj          aaaaaaaaaaaaaaaaaa           vv      vv           aaaaaaaaaaaaaaaaaa   ");
        System.out.println("   jj            jj         aa                aa           vv    vv           aa                aa  ");
        System.out.println("   jj            jj        aa                  aa           vv  vv           aa                  aa ");
        System.out.println("    jjjjjjjjjjjjjj        aa                    aa           vvvv           aa                    aa");

    }

}
