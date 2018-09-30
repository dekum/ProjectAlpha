# ProjectAlpha
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
<h4>Goal:</h4>
<p>Create a production plant for any type of product ranging from a simple packaging system to a variety of electronic devices.
create a production line for multimedia devices which include music and movie players.
Design a template in Java for creating and recording all future production line items.  
For this particular production facility you will only implement a concrete class for music and movie players.</p>
<h4>Step 1</h4>
<p>Create a Item inteface with the following methods

  void setProductionNumber(int parameter);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();</p></p>
  <h4>Step 2</h4>
Create ItemType Enum with a type: (type,code)

  Type | Code
------------ | -------------
Audio | AU
Visual | VI
  AUDIOMOBILE| AM
  VISUALMOBILE|VM
  
  <h4>Step 3</h4>
  <p>Create a abstract class called Product which will implement the methods created earlier. It will add {} and code to the methods defined in Item interface. These fields are also created
  
  Date manufacturedOn; 
  String name;
  final String MANAFACTURER = "OracleProduction";

  static int currentProductionNumber = 0;


<h3> Summary </h3>
There exists a Main class, a Widget class, Product class, and Item interface.
Main Class is the driver class, which also contains widget
Widget class, extends Product and will intialize it when in Main method
Product class is an abstract class that implements Item's methods, and provides methods for Widget
Item interface creates classes for Product to implement.

When user runs Main(), it will display:
Manufacturer
Serial Number
Date created
Name of product
and then it will display ItemType's fields

</p>





