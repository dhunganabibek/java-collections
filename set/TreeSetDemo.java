package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

  public static void main(String[] args) {
    Fruit f = new Fruit(20, "green", "Mango");
    Fruit f1 = new Fruit(10, "red", "Gauva");
    Fruit f2 = new Fruit(30, "orange", "Orange");
    Fruit f3 = new Fruit(70, "blue", "Pineapple");
    Fruit f4 = new Fruit(80, "purple", "Jackfruit");
    Fruit f5 = new Fruit(20, "green", "Mango");

    Set<Fruit> myfruits = new TreeSet<Fruit>((Fruit fruit1, Fruit fruit2) -> {
      return fruit1.getDescription().compareTo(fruit2.getDescription());
    });
    myfruits.add(f);
    myfruits.add(f1);
    myfruits.add(f2);
    myfruits.add(f3);
    myfruits.add(f4);
    myfruits.add(f5);

    //printing the element
    for (Fruit fruit : myfruits) {
      System.out.println(fruit);
    }
  }
}
