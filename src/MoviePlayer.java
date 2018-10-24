public class MoviePlayer extends  Product implements  MultimediaControl {
Screen screen;
MonitorType monitorType;

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
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
}
