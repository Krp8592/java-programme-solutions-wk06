package javahomeworkweek06;

/**
 * Call the above instance method into the Main method and Run the programme.
 */

public class Ans01Instance {
    //Declare Instance Variables
    int a = 15;
    int b = 30;

    //Declare the Main method.
    public static void main(String[] args) {
        Ans01Instance obj = new Ans01Instance();//Call the above instance method into the Main method
        obj.instance1(); // Calling instance method in main method

    }

    //Declare one instance method.
    public void instance1() {
        System.out.println(a);
        System.out.println(b);
    }

}
