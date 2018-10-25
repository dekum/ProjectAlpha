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
    System.out.println("Playing Movie");


  }

  @Override
  public void stop() {
    System.out.println("Stop Movie");

  }

  @Override
  public void previous() {
    System.out.println("Previous Movie");

  }

  @Override
  public void next() {
    System.out.println("next Movie");

  }

  @Override
  public String toString() {
    return super.toString()+
        "\nScreen : " + screen +
        " \nMonitorType: " + monitorType
        ;
  }

  public int compareTo(Product p) {
    /**
     * Overriden Collection.sort's methos to use this method.
     * Without it wouldn't know what to sore
     */
    return name.compareTo(p.getName());
    //Returns 1 if Greater than
    //Return 0 is equal
    //Return -1

  }

  @Override
  public int compareTo(Object o) {
    //System.out.println("Movie player compare");
    return super.compareTo(o);

  }
}
