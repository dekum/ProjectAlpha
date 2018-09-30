import java.util.Date;

public abstract class Product implements Item{
    static int serialNumber;
    //String manufacturer;
    Date manufacturerOn;
    String name;
     final String manufacturer = "OracleProduction";

    static int currentProductionNumber = 0;



    public void setProductionNumber(int productionNumber) {
        ///this.currentProductionNumber = parameter;
        serialNumber= productionNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;

    }

    public Date getManufactureDate(){
        return manufacturerOn;
    }

    public int getSerialNumber(){
        return  serialNumber;
    }

    Product(String name){
        this.name = name;
        serialNumber = currentProductionNumber++;
        manufacturerOn = new Date();


    }

    @Override
    public String toString() {
        /*
        Will print
        Manafucture : Maanufactuer's NAme
        Serial Numer : serialNumber
        Date : Date
        Name : ProductName

         */

        String line ="Manufacturer  : "+manufacturer+"\n" +
                "Serial Number : " + serialNumber +"\n" +
                "Date          : "+getManufactureDate()+"\n"+
                "Name          : "+ name;
        return  "hi";

    }
}
