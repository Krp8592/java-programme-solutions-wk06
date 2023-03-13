package javahomeworkweek06;

/**
 * Call both instance and static methods into the Main method and run the programme
 */

public class Ans04With2Variables {
    //Declare two instance variables
    int a = 2;
    int b = 3;
    //Declare two static variables
    static int x = 4;
    static int y = 5;

    // Declare the Main method.
    public static void main(String[] args) {
        //Call static method and instance method into main method.
        System.out.println("Static Method");
        statico1();
        System.out.println("Instance Method");
        Ans04With2Variables obj1 = new Ans04With2Variables();
        obj1.instance01();

    }

    //Declare one instance method
    public void instance01() {
        //Call both instance and static variables
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }

    //Declare one static method
    public static void statico1() {
        //Call both instance and static variables
        //create object for instance var
        Ans04With2Variables obj = new Ans04With2Variables();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(x);
        System.out.println(y);
    }
}


