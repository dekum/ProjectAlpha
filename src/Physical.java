public class Physical<T extends MultimediaControl>{
  // T stands for "Type"
  private T t;


  public void play() {
    t.play();


  }


  public void stop() {
t.stop();
  }


  public void previous() {
t.previous();
  }


  public void next() {
t.next();
  }


  public void set(T t) { this.t = t;}

  public T  get() {return t;}

  Physical(){



  }
  public static void main(String [] args){
    //Physical<Integer> integerBox = new Physical<>();
    Physical<MultimediaControl> mov = new Physical<>();
    mov.set(new AudioPlayer("minipod","mp4"));
    mov.play();
    mov.set(new MoviePlayer("minipod",new Screen("1366x768",40,22),MonitorType.LED));
    mov.play();
  }



}
