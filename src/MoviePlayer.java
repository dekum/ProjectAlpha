public class MoviePlayer extends  Product implements  MultimediaControl {
Screen screen;
MonitorType monitorType;

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  public MoviePlayer(){
    super("Windows Media PLayer Classic");
    screen = new Screen("200x200", 33,33);
    monitorType= MonitorType.LCD;
  }

  @Override
  public void play() {
    System.out.println("Playing movie");


  }

  @Override
  public void stop() {
    System.out.println("Stop movie");

  }

  @Override
  public void previous() {
    System.out.println("Previous movie");

  }

  @Override
  public void next() {
    System.out.println("Next movie");

  }

  @Override
  public String toString() {
    return super.toString()+
        "\nScreen : " + screen +
        " \nMonitorType: " + monitorType
        ;
  }

//  public int compareTo(Product p) {
//    /**
//     *This methos will call Product's
//     */
//    return name.compareTo(p.getName());
//    //Returns 1 if Greater than
//    //Return 0 is equal
//    //Return -1
//
//  }


}
