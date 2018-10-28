/**
 * Philemon Petit-Frere
 * AudioPlayer.java
 * 10/20/2018
 * AudioPLayer is a subclass of Product class and implements MultimediaControl's methods
 * The methods it gets from MultimediaControl are play() stop() next() pervious().
 * It adds a printline for each method when the method is called
 *
 */

public class AudioPlayer extends  Product implements MultimediaControl {
  private String audioSpecification;
  private ItemType mediaType;

  public AudioPlayer() {
    //A default constructor that initializes the variables with default Fields I created.
    super("The Zune");
    audioSpecification = "MP3-A";
    mediaType = ItemType.AUDIO;
  }

  AudioPlayer(String name, String audioSpecification){
    /**
     * Take A string, and a String and initializes AudioPlayer's fields.
     * mediaType is Audio because I know this is a AudioPlayer.
     */
    super(name);
    this.audioSpecification= audioSpecification;
    this.mediaType= ItemType.AUDIO ;
  }


  public String getAudioSpecification() {
    //Get this object's audioSpecification value
    return audioSpecification;
  }

  @Override
  public void play() {
    //Prints Playing
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    //Prints Stopping
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    //Prints Previous
    System.out.println("Previous");

  }

  @Override
  public void next() {
    //Prints Next
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
