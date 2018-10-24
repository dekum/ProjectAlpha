/**
 * Philemon Petit-Frere
 * 9/27/2018
 * COP 3003 - OOP
 * Project: ProjectAlpha
 * File: Product.java
 * Product is a abstract class that Widget will extend from
 * Since its a abstract class it cannot create objects
 * Abstract classes work great as blueprints, and encourages reusing code.
 */

import java.util.Date;
import java.util.List;

public abstract class Product implements Item {
  //Abstract classes cannot be implemented, but are useful for classes that have similar methods to extend from.
  //Product will implement the basic functionality that all items on a production line should have.
  static int serialNumber;
  //String MANUFACTURERfacturer;
  Date manufacturedOn; //manufacturedOn is a object of Date
  String name;//Name of the Product, to be initialized in constructor
  final String MANUFACTURER = Item.MANUFACTURER; //name of manufacturer

  static int currentProductionNumber = 0; //This is static so it can constantly be incremented.


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

//  static <T extends Product&MultimediaControl > void printType(List<?> list, Class<?> c){
//  for (Object o : list){
//    if(!c.isInstance(o)){
//      //Class doesnt ma
//      return; false;
//    }
//
//  }
//
//  }

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
