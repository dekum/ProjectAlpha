/**
 * Philemon Petit-Frere
 * MoviePlayer.java
 * 10/20/2018
 * MoviePlayer is a subclass of Product class and implements MultimediaControl's methods
 * The methods it gets from MultimediaControl are play() stop() next() pervious(.
 * Similar to AudioPlayer in that regard.
 * It adds a printline for each method when the method is called, adding Movie as well.
 * Screen is a class that takes 3 parameters (String,Int,Int).
 * MonitorType is a enum, which 3 options.
 * When a MoviePlayer object is constructed these 3 fields are given as a parameter.
 * When creating an Object of this class you need to sent it a new Screen(STr,int,int) in the parameter.
 *
 */

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screen; //Object of Screen Class
  MonitorType monitorType;// Object of MonitorType enum

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  public MoviePlayer() {
    super("Windows Media PLayer Classic");
    screen = new Screen("200x200", 33, 33);
    monitorType = MonitorType.LCD;
  }

  //Overriden methods print lines.

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
    return super.toString() +
        "\nScreen : " + screen +
        " \nMonitorType: " + monitorType
        ;
  }
}
