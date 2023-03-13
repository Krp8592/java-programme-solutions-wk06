package javahomeworkweek06;

/**
 * Call both instance and static methods into the Main method and run the programme.
 */

public class Ans03InstanceStatic {

    //Declare one instance and one static variable.

    static int a = 15;
    int b = 30;

    public static void main(String[] args) {
        //Call static method into main method
        System.out.println("Static Method");
        static01();
        //Call instance method into main method
        System.out.println("Instance Method");
        Ans03InstanceStatic obj1 = new Ans03InstanceStatic();
        obj1.instance01();

    }

    //Declare one instance method.
    public void instance01() {
        //Call both instance and static variables into instance method
        System.out.println(a);
        System.out.println(b);

    }

    // Declare one static method.
    public static void static01() {
        Ans03InstanceStatic obj = new Ans03InstanceStatic();
        //Call both instance and static variables into static method
        System.out.println(a);
        System.out.println(obj.b);

    }
}
