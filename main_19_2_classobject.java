/*
 You can also create an object of a class and access it in another class.
 This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).
 Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory/folder:
 */


public class  main_19_2_classobject {

  public static void main(String[] args) {
    main_19_1_classobject myObj = new main_19_1_classobject();
    System.out.println(myObj.x);
  }
}