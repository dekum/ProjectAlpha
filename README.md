# ProjectAlpha

 * Philemon Petit-Frere
 * 10/29/2018
 * COP 3003 - OOP
 * Project: ProjectAlpha
 * Purpose of Project: design a template in Java for creating and recording all future
 * production line items. Also also allow easy modification to handle different products
 *Sources for help: Stackexchange, Garrett Graber, Nathalie Crespo, github.com, http://tutorials.jenkov.com/java-regex/pattern.html, geeksforgeeks,https://www.tutorialspoint.com/, 
 
<h4>Goal:</h4>
<p>Create a production plant for any type of product ranging from a simple packaging system to a variety of electronic devices.
create a production line for multimedia devices which include music and movie players.
Design a template in Java for creating and recording all future production line items.  
For this particular production facility you will only implement a concrete class for music and movie players.</p>
<h4>Step 1</h4>
<p>Create a Item inteface with the following methods

  void setProductionNumber(int parameter);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();</p></p>
  <h4>Step 2</h4>
Create ItemType Enum with a type: (type,code)

  Type | Code
------------ | -------------
Audio | AU
Visual | VI
  AUDIOMOBILE| AM
  VISUALMOBILE|VM
  
  <h4>Step 3</h4>
  <p>Create a abstract class called Product which will implement the methods created earlier. It will add {} and code to the methods defined in Item interface. These fields are also created
  <br>
  Date manufacturedOn;<br> 
  String name;<br>
  final String MANAFACTURER = "OracleProduction";<br>

  static int currentProductionNumber = 0;
  
  <h4>Step 4 </h4>
  All items or in this production line will have basic media Control. As in they will extend a interface named MltimediaControl that will have the folloinwg meothds:
  
* public void play();
* public void stop();
* public void previous();
* public void next()

The classes that implement this interface, will have inherit these methods and define their own function for it.

<h4>Step 5<h4>
<p> We require a concrete class that will allow us to capture the details of an audio player. Create a class
 called AudioPlayer that is a subclass of Product and implements the MultimediaControl interface.</p>
 
 A new class named AudioPlayer is created and it prints to the screen, when it's methods are called.
 ````
 public class AudioPlayer extends  Product implements MultimediaControl {
  private String audioSpecification;
  private ItemType mediaType;
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
}
````

<h4>Step 6<h4>
Create a class called AudioPlayer Driver to test the Audo player class, it will print to screen from the methods of AudioPlayer

```
public class AudioPlayerDriver{

  public static void  testAudioPlayer(){
    AudioPlayer ap = new AudioPlayer("ipod Mini", "MP3");
    ap.play();
    ap.stop();
    ap.next();
    ap.previous();
    System.out.println(ap.toString());
    AudioPlayer ap2 = new AudioPlayer("Walkman", "WAV");
    System.out.println(ap2.toString());
  }
}
````

<h4>Step 7</h4>
The production facility will also create portable movie players. The main difference between these and
the audio players is that they contain screens.
 
 Create a monitor Type enum that will store:
|Type|
_____
|LCD|
|LED|

<h4>Step 8</h4>
Create an interface called ScreenSpec. This will define 3 methods:

* public String getResolution();
* public int getRefreshRate();
* public int getResponseTime();

Just like MultimediaControl interace, the methods have nothing in the codeblocks. 
But a class that implements this will define the methods
 
 
<h4>Step 9</h4>
Create a class called Screen that implements ScreenSpec. Add three fields
* String resolution
* int refreshrate
* int responsetime

Screen inherits the methods from ScreenSepc and fills the defintion of methods.

````
@Override
  public String getResolution() {
    return resolution;
  }
  
  public int getRefreshrate() {
    return refreshrate;
  }
  
  public int getResponsetime() {
    return responsetime;
  }
  ````


<h4>Step 10</h4>
Was to create a driver class to test Screen class, but since screen objects are created when MoviePlayers are.
This step was combined into Step 12
<h4>Step 11</h4>
Create a class called MoviePlayer that extends Product and implements MultimediaControl.
Add 2 fields to this class called screen and monitor type and assign appropriate types to them.
Complete the methods from the MultimediaControl interface in a similar fashion to the audio player.

Movie player class is similar to Audio player, but movie player has the screen class as one of its fields.

````
public class MoviePlayer extends  Product implements  MultimediaControl {
Screen screen;
MonitorType monitorType;

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

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

````

<h4>Step 12</h4>
Create a diver class to test the functionality of the movie player.
A MoviePlayer Driver class was created to test the Movie Player objects.

```
public class MoviePlayerDriver{
//private String audioSpecification;
//private ItemType mediaType;

  public static void  testMoviePlayer(){
/**
 * Create objects of MoviePlayer
 */
    MoviePlayer mp = new MoviePlayer("DBPOWER MK101",new Screen("720x480",40,22),MonitorType.LCD);
    System.out.println(mp.toString());
    System.out.println("\n");
    MoviePlayer mp2 = new MoviePlayer("Pyle PDV156BK",new Screen("1366x768",40,22),MonitorType.LED);
    System.out.println(mp2.toString());
  }
}
````

<h4>Step 13</h4>
Create a driver class that will demonstrate that any class that implements the MultimediaControl Interface would be able to be
instantiated and use its methods used no matter if it was an audio or movie player.

To perform this step, another driver class was created to test if the Class Delaration can be changed to a class that implemented MultimediaControl. It was provent to be true with this code:

```
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
    
    ````

<h4>Step 14</h4>
<h4>Step 15</h4>
<h4>Step 16</h4>
<h3> Summary </h3>

* There exists a Main class, a Widget class, Product class, and Item interface.
* Main Class is the driver class, which also contains widget
* Widget class, extends Product and will intialize it when in Main method
* Product class is an abstract class that implements Item's methods, and provides methods for Widget
* Item interface creates classes for Product to implement. Also contain ItemType Enum with fields.

When user runs Main(), it will display:

* Manufacturer
* Serial Number
* Date created
* Name of product

Next then it will display ItemType's fields.

Tested on Windows 10, IntelJ IDEA 32-bit on 10/28/18.

</p>

<h3>Techniques
 <p>Program demostrates <hr> 
 **Polymorphism**: is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

Any Java object that can pass more than one IS-A test is considered to be polymorphic. In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.

In this project, Chasis is a child class of __




