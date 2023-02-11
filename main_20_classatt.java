/*
    Attribute/fields of a class variables within a class:
 */

public class main_20_classatt {



    int x = 5;
    int y = 3;

    //An attribute is declared but not initialized or assigned
    int z;

    //If you don't want the ability to override existing values, declare the attribute as final
    final int w = 9;

/*
    All of these are done with 1 object only

    public static void main(String[] args) {
        main_20_classatt myObj = new main_20_classatt();

        //You can access attributes by creating an object of the class, and by using the dot syntax
        System.out.println(myObj.x);

        // You can override existing values
        myObj.x = 25; // x is now 25
        System.out.println(myObj.x);

        // You can set an unassigned attribute here
        myObj.z = 40;
        System.out.println(myObj.z);

      }
 */

    // Multiple objects: If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other
    public static void main(String[] args) {
        main_20_classatt myObj1 = new main_20_classatt();  // Object 1
        main_20_classatt myObj2 = new main_20_classatt();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25
    }



}
