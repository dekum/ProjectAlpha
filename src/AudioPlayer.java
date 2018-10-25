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
    System.out.println("Stop");

  }

  @Override
  public void previous() {
    System.out.println("Previous");

  }

  @Override
  public void next() {
    System.out.println("next");

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
  //  System.out.println("AudioPlayer compareto");
  return super.compareTo(o);
   // return 0;
  }
}
