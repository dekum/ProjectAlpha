/**
 * Screen.java
 * It implements methods of the ScreenSpec interface.
 * This Class take 3 parameters (String,int,int) and creates a Screen object
 * This class is used by MoviePlayer to create an object.
 *
 */

public class Screen implements ScreenSpec {
  String resolution;
  int refreshrate;
  int responsetime;

  @Override
  public String getResolution() {
    return null;
  }

  @Override
  public int getRefreshRate() {
    return 0;
  }

  @Override
  public int getResponseTime() {
    return 0;
  }

  @Override
  public String toString() {
    String line = "Resolution : " + resolution + "\n" +
        "Refresh Rate : " + refreshrate + "\n" +
        "Response Time : " + responsetime;

    //I use line because I felt it was easier to code with
    return line;
  }
  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }
}
