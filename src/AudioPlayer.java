public class AudioPlayer extends  Product implements MultimediaControl {
  private String audioSpecification;
  private ItemType mediaType;

  public AudioPlayer() {
    super("The Zune");
    audioSpecification = "MP3-A";
    mediaType = ItemType.AUDIO;
  }

  AudioPlayer(String name, String audioSpecification){
    super(name);

    this.audioSpecification= audioSpecification;
    this.mediaType= ItemType.AUDIO ;

  }

  public String getAudioSpecification() {
    return audioSpecification;
  }

  @Override
  public void play() {
    System.out.println("Playing");

  }

  @Override
  public void stop() {
    System.out.println("Stopping");

  }

  @Override
  public void previous() {
    System.out.println("Previous");

  }

  @Override
  public void next() {
    System.out.println("Next");

  }

  @Override
  public String toString() {
    return
        super.toString()+
            "\nAudio Spec : " + audioSpecification +
            "\nType : " + mediaType
        ;
  }

  public static void main(String [] args){
    AudioPlayer ap = new AudioPlayer("J","Lw");
    System.out.println(ap.toString());

  }


}
