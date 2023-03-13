package javahomeworkweek06;

/**
 * Call the static method into the Main method and Run the programme.
 */

public class Ans02Static {

    //Declare two static variable

    static int a = 15;

    static int b = 30;

    //Declare the Main method
    public static void main(String[] args) {
        //Call the static method into the Main method and Run the programme.
        static1();

    }

    //Declare one static method
    public static void static1() {
        // Call both static variables into the static method inside the print statement.
        System.out.println(a);
        System.out.println(b);

    }

}
