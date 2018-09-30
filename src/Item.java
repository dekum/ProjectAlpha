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

  enum ItemType {
    AUDIO("AU"),
    VISUAL("VI"),
    AUDIOMOBILE("AM"),
    VISUALMOBILE("VM");
    //Remember to include "" in parenthesis, this was causing a error earlier.

    String code;

    ItemType(String code) {
      //Constuctor method for ItemType enum
      //Without this method, the enum fields for the codes will cause errors
      this.code = code;
    }


    public String getCode() {
      //used by it (in main) to return the code value
      return code;
    }

  }
  //Methods to be further implemented by Product Class

  static final String MANAFACTURER = "OracleProduction";

  void setProductionNumber(int parameter);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();


}
