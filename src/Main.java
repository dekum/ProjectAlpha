/**
 * Philemon Petit-Frere
 * 9/27/2018
 * COP 3003 - OOP
 * Project: ProjectAlpha
 * File: Main
 * Purpose of Project: design a template in Java for creating and recording all future
 * production line items. Also also allow easy modification to handle different products
 *Sources for help: Stackexchange, Garrett Graber, github.com
 *
 */
public class Main {

  /**
   * Main  is the driver class which creates 2 Widgets, Widgets extends Product so when Widget is mad
   * Product's constructor also runs.
   * Lastly Main prints the values of codes of the ItemList Enum
   */
  public static void main(String args[]) {

    Widget w1 = new Widget("Widget 1");//Create Widget called Widget1
    System.out.println(w1.toString());//Use Product's toString method to print information.
    Widget w2 = new Widget("Widget 2");//Create Widget called Widget2
    System.out.println(w2.toString()); //Use Product's toString method to print information.

    for (Item.ItemType it : Item.ItemType.values()) {
      //For loop ends when, ItemType.values reaches the end, as this case 4 times.
      System.out.println(it + " " + it.code); //Print type and code of ItemType Enum
    }
    //End of program

  }

}

class Widget extends Product {
  //Widget extends Product, as Product is a abstract class and thus will not be able to make an object
  public Widget(String name) {
    //Widget accepts a name, then uses that name as a parameter for Product's constructor
    super(name);//The super of Widget is Prodct, this will call it's constructor.
  }

}