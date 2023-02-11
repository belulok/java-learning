public class main_21_classmethods {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    // we created a static method, which means that it can be accessed without creating an object of the class, unlike public,
    // which can only be accessed by objects:
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        main_21_classmethods myObj = new main_21_classmethods(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
    }
}
