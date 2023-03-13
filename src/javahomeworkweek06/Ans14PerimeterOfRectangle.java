package javahomeworkweek06;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 */

public class Ans14PerimeterOfRectangle {
    //Define main method.
    public static void main(String[] args) {
        //Call instance method into main method.
        Ans14PerimeterOfRectangle obj = new Ans14PerimeterOfRectangle();
        obj.area();

    }

    public void area() {
        //Define variables to store width and height of rectangle.
        Double w = 5.5;
        Double h = 8.5;
        //Define variable to store formula of area and perimeter of a rectangle.
        double a = w * h;
        double p = (2 * (w + h));
        //Define print statement with concatenation method.
        System.out.println(" Area is" + " 5.5 " + "x" + " 8.5 " + " = " + a);
        System.out.println(" Perimeter is" + " 2 " + "x " + ("(5.6 + "+"8.5)") + " = " + p);

    }

}
