/**
 * Philemon Petit-Frere
 * 9/27/2018
 * COP 3003 - OOP
 * Project: ProjectAlpha
 * File: Main
 * Purpose of Project: design a template in Java for creating and recording all future
 * production line items. Also also allow easy modification to handle different products
 *Sources for help: Stackexchange, Garrett Grabber, github.com
 *
 */

import  java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  /**
   * Main  is the driver class which creates 2 Widgets, Widgets extends Product so when Widget is mad
   * Product's constructor also runs.
   * Lastly Main prints the values of codes of the ItemList Enum
   */
  public static void main(String args[]) {

//    Widget w1 = new Widget("Widget 1");//Create Widget called Widget1
//    System.out.println(w1.toString());//Use Product's toString method to print information.
//    Widget w2 = new Widget("Widget 2");//Create Widget called Widget2
//    System.out.println(w2.toString()); //Use Product's toString method to print information.
//
//    for (ItemType it : ItemType.values()) {
//      //For loop ends when, ItemType.values reaches the end, as this case 4 times.
//      System.out.println(it + " " + it.code); //Print type and code of ItemType Enum
//    }
//

   // MoviePlayerDriver.testMoviePlayer();
    //PlayerDriver.testPlayer();
    //End of program
    //Write ome line of code to create and Array of products
    ArrayList<Product> productList = new ArrayList<>();
    //Write one line of code to call testCollection and assign the result to the arraylist
    productList = testCollection();

    // write one line of code to sort arraylist
    Collections.sort(productList);
    //Call print method on the array list
   print(productList);

    //Step 15
    //Compelete the header for the testCollection method here









  }
  public static void print(ArrayList<Product> products){

    for (Product p :products
    ) {
      System.out.println(p.toString());

    }
  }

  private static ArrayList<Product> testCollection() {
    ArrayList<Product> products = new ArrayList<>();
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman ", "WAV");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101", new Screen("720x480",40,22),MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PdV156BK", new Screen("1366x768",40,22),MonitorType.LED);

    a1.toString();
    a2.toString();
    m1.toString();
    m2.toString();
    System.out.println("here");
    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;

  }

}

abstract class Widget extends Product {
  //Widget extends Product, as Product is a abstract class and thus will not be able to make an object
  public Widget(String name) {
    //Widget accepts a name, then uses that name as a parameter for Product's constructor
    super(name);//The super of Widget is Prodct, this will call it's constructor.
  }

}