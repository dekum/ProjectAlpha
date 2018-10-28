/**
 * Philemon Petit-Frere
 * 9/27/2018
 * COP 3003 - OOP
 * Project: ProjectAlpha
 * File: Item.java
 * Create an enum called ItemType that stores:
 * Type Code
 * AUDIO AU
 * VISUAL VI
 * AUDIOMOBILE AM
 * VISUALMOBILE VM
 *
 * */
import java.util.*;


public interface Item {
  //Methods to be further implemented by Product Class

  //A constant called manufacturer that would be set to “OracleProduction”.
  static final String MANUFACTURER = "OracleProduction";

  //A method setProductionNumber that would have one integer parameter
  public void setProductionNumber(int productionNumber);

  //A method setName that would have one String parameter
  public void setName(String name);

  //A method getName that would return a String
  public String getName();

  //A method getManufactureDate that would return a Date
  public Date getManufactureDate();

  //A method getSerialNumber that would return an int
  public int getSerialNumber();
}
