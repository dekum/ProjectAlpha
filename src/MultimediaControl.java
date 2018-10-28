/**
 * MultimediaControl.java
 * 10/20/1
 * This class simulates how a audio device would control what being played.
 * MultimediaControl is an interface storing 4 methods that will be implemented by AudioPlayer and MoviePlayer.
 *
 */
public interface MultimediaControl {
  //Methods to be implemented by other classes.
  public void play();
  public void stop();
  public void previous();
  public void next();

}
