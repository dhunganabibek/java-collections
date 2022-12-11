package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Fruit f = new Fruit(20, "green", "Mango");
    Fruit f1 = new Fruit(10, "red", "Gauva");
    Fruit f2 = new Fruit(30, "orange", "Orange");
    Fruit f3 = new Fruit(70, "blue", "Pineapple");
    Fruit f4 = new Fruit(80, "purple", "Jackfruit");
    Fruit f5 = new Fruit(20, "green", "Mango");

    System.out.println(f.hashCode());
    System.out.println(f5.hashCode());

    Set<Fruit> myfruits = new HashSet<Fruit>();
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
    //searching the fruits

  }
}
