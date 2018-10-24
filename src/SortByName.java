import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortByName<T extends  MoviePlayer,K extends  MoviePlayer> {
private T t;
private K k ;
private ArrayList<String> names = new ArrayList<>();

 void  comppare(
 //    T t,K k
 ){
   names.add(k.getName());
   names.add(t.getName());
   Collections.sort(names);
   for (String str: names
   ) {
     System.out.println(str);

   }


  }
  public void setT(T t) { this.t = t;}

  public T  getT() {return t;}

  public void setK(K k) { this.k = k;}

  public K  getK() {return k;}

  public SortByName(T t, K k) {
    this.t = t;
    this.k = k;
  }
}
