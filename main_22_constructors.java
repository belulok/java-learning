public class main_22_constructors {

    int modelYear;
    String modelName;

    // A constructor in Java is a special method that is used to initialize objects.
    //Constructors can also take parameters, which is used to initialize attributes.
    public main_22_constructors(int year, String name) {
    modelYear = year;
    modelName = name;
    }

    public static void main(String[] args) {
        // The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
        main_22_constructors myCar = new main_22_constructors(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }

}
