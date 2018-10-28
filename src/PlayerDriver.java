/**
 * Philemon Petit-Frere
 * PlayerDriver.java
 * This Class shows polymorphism
 * AudioPlayer and MoviePlayer implement MultimediaControl.
 * This Class proves that they can be declared as MultimediaControl and still use it's partiuclar methods.
 *
 */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlayerDriver {

  public static void testPlayer() {

    MultimediaControl mc1 = new  AudioPlayer();
    MultimediaControl mc2 = new MoviePlayer();
    mc1.next();
    mc1.play();
    mc1.previous();
    mc1.stop();
    mc2.next();
    mc2.play();
    mc2.previous();
    mc2.stop();
  }
}
