public class MoviePlayerDriver{
//private String audioSpecification;
//private ItemType mediaType;

  public static void  testMoviePlayer(){
//MAke to MuitltmediaControll. mp = new movieaplayer
    MoviePlayer mp = new MoviePlayer("DBPOWER MK101",new Screen("720x480",40,22),MonitorType.LCD);
    System.out.println(mp.toString());
    System.out.println("\n");
    MoviePlayer mp2 = new MoviePlayer("PDV156BK",new Screen("1366x768",40,22),MonitorType.LED);
    System.out.println(mp2.toString());
    System.out.println("Here");
//    MultimediaControl mc1= new MultimediaControl() {
//      @Override
//      public void play() {
//        System.out.println("Playing");
//
//      }
//
//      @Override
//      public void stop() {
//        System.out.println("Stop");
//
//      }
//
//      @Override
//      public void previous() {
//        System.out.println("Previous");
//
//      }
//
//      @Override
//      public void next() {
//        System.out.println("next");
//
//      }
//    };
//    mc1.next();
//    mc1.play();
//    mc1.previous();
//    mc1.stop();
//
//    MultimediaControl mc2= new MultimediaControl() {
//      @Override
//      public void play() {
//        System.out.println("Playing Movie");
//
//      }
//
//      @Override
//      public void stop() {
//        System.out.println("Stop Movie");
//
//      }
//
//      @Override
//      public void previous() {
//        System.out.println("Previous Movie");
//
//      }
//
//      @Override
//      public void next() {
//        System.out.println("next Movie");
//
//      }
//    };
//
//    mc2.next();
//    mc2.play();
//    mc2.previous();
//    mc2.stop();
//
//    mp.next();
//    mp.play();
//    mp.previous();
//    mp.stop();




  }
}