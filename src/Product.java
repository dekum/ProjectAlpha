/**
 * Philemon Petit-Frere
 * 9/27/2018
 * COP 3003 - OOP
 * Project: ProjectAlpha
 * File: Product.java
 * Product is a abstract class that Widget will extend from
 * Since its a abstract class it cannot create objects
 * Abstract classes work great as blueprints, and encourages reusing code.
 * For Step 16 Product now also implements Comparable, a Java Collection that can compare objects.
 * It implemented Comparable's method  "compareTo" where you can change which variable it compares and returns the result.
 * Comparable has diamond Product because I know I will only send subclass of Product objects.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Product implements Item,Comparable <Product> {

  /**
   * Abstract classes cannot be implemented, but are useful for classes that have similar methods to extend from.
   *  Product will implement the basic functionality that all items on a production line should have.
   */

  int serialNumber;
  //String MANUFACTURERfacturer;
  Date manufacturedOn; //manufacturedOn is a object of Date
  String name;//Name of the Product, to be initialized in constructor
  final String MANUFACTURER = Item.MANUFACTURER; //name of manufacturer
  static int currentProductionNumber = 1; //This is static so it can constantly be incremented.

  public int compareTo(Product p) {
    /**
     * This will sort objects of projects by their field "name"
     * Since the objects we make in program are AudioPlayer and MoviePlayer I have them call this method
     * to sort the elements.
     * This method return an Int because the result of a compareTo is either a -1,0,1
     * -1, if first string is lower lexicographic than the second., 0 if equal And 1 if first  is greater.
     *
     * Also instead of using the default Object o, we can use Product p in parameter since I Product objects are send here.
     */
    return name.compareTo(p.getName());
    //Returns 1 if name Greater than p.getName
    //Return 0 is both are equal
    //Return -1 if name is lessThan p.getName

  }
  public void setProductionNumber(int productionNumber) {
    ///this.currentProductionNumber = parameter;
    serialNumber = productionNumber;
  }

  public void setName(String name) {
    //sets instance variable to parameter name
    this.name = name;
  }

  public String getName() {
    return name;

  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  Product(String name) {
    //Widget will pass a name to this constuctor
    this.name = name; //Product's instance name will be set to parameter name
    serialNumber = currentProductionNumber++;//SeriesNumber received productionNumber
    // and productNumber will increment by one
    manufacturedOn = new Date(); //manafacturedOn will receive new Date, set to current time the program runs
  }

  static void printType(List<?> list, Class<? extends Product> c){
    for (Object o : list){
      /**
       * printType is a generic method whose first parameter accepts a List of any type, and the
       * second parameter accepts any class at extends Product
       * This method checks any object in the list matches the sent Class, if it does it will print that object.
       * You can use this method to specify you want to print ONLY AudioPlayer objects or ONLY MoviePlayer objects
       *
       * Example of calling this method: Product.printType(productList,MoviePlayer.class); From Step 16.
       * Product is class, printType is method of product being called, productList is a Arraylist of products
       * and MoviePlayer.class is the class variable we want this method to compare to.
       * When that line is ran, this method will search for MoviePlayer objects and will the toStrings of them.
       *
       *The Class>? extends Product< is a wild card that makes sure the method only takes objects that extend Product.
       *
       */
      if (c.isInstance(o)) { //Check if Class matches the Object's class
        //Class Matches, print toString.
        System.out.println(o.toString());
      }

    }

  }

  @Override
  public String toString() {
    //Override means it will override the default toString method for the class
        /*
        Will print
        Manafucture : Maanufactuer's NAme
        Serial Numer : serialNumber
        Date : Date
        Name : ProductName

         */

    String line = "Manufacturer  : " + MANUFACTURER + "\n" +
        "Serial Number : " + serialNumber + "\n" +
        "Date          : " + getManufactureDate() + "\n" +
        "Name          : " + name;
    //I use line because I felt it was easier to code with
    return line;

  }
}
