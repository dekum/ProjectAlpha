import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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
  public static  <T extends Product> void printMoviePlayer(T t){
    if (t instanceof MoviePlayer) {
      System.out.println(t.toString());
    }


  }

  public static void main(String [] args){
    //Physical<Integer> integerBox = new Physical<>();
    Physical<MultimediaControl> mov = new Physical<>();
    mov.set(new AudioPlayer("minipod","mp4"));

    mov.play();
    mov.set(new MoviePlayer("TheZune",new Screen("1366x768",40,22),MonitorType.LED));
    mov.play();
    new AudioPlayer("Walkman","wav");
    new MoviePlayer("VLC",new Screen("1600x1080",40,22),MonitorType.LED);
    ArrayList<Product> productList = Product.getProductList();
    ArrayList<String> listOfNames = new ArrayList<>();
    for (Product p : Product.getProductList()){
      System.out.println(p.getName());
      listOfNames.add(p.getName());

      printMoviePlayer(p);

    }


    System.out.println("\nSorted:\n");

    Collections.sort(productList,
        new Comparator<Product>() {
      public int  compare(Product p1, Product p2)
      {
        return p1.getName().compareTo(p2.getName());
      }


        }
    );
    for (Product p: productList)
    {
      System.out.println(p.getName() + p.getClass());

    }



    System.out.close();
    //Try and sort list
    //ArrayList<Screen> sc = new ArrayList<>();
  //  ArrayList<String> sc = new ArrayList<>();
   // Collections.sort();
    Collections.sort(listOfNames, String.CASE_INSENSITIVE_ORDER);
    for (String str: listOfNames){
      System.out.print(str);
      for (Product p: Product.getProductList()){
        if (str.equalsIgnoreCase(p.getName()))
        {
          System.out.print(p.getClass()+"\n");
          if (p instanceof  AudioPlayer){
            //AudioPlayer pol = (AudioPlayer)p; These two lines are needed
            //pol.getAudioSpecification();
            System.out.println(((AudioPlayer) p).getAudioSpecification());

            //So I've proven that Even though it's a list of product, it still has it's subclass(AudioPLayer) fields and variables set
            //So I can use a static List on a class's fields and when that class is initalized i can add it to the list
            //And I will be able to use subclasses's fields as aswell, and the list works everywhere.
          }
          System.out.println(p.toString());
        }

      }
    }




  }



}
