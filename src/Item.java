import java.util.*;




public interface Item {
    enum ItemType{
        AUDIO("AU"),
        VISUAL("VI"),
        AUDIOMOBILE("AM"),
        VISUALMOBILE("VM");


        String code;

        ItemType(String code) {
            this.code = code;
        }

        //get method for returning the value code
        public String getCode() {
            return code;
        }

    }


    static final String manafacturer = "OracleProduction";
     void setProductionNumber( int parameter);
     void setName(String name);
     String getName();

     Date getManufactureDate();

     int getSerialNumber();




}
