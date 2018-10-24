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
        "Refreshrate : " + refreshrate + "\n" +
        "Responsetime : " + responsetime;

    //I use line because I felt it was easier to code with
    return line;

  }
  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }
}
