package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Set<String> setData = new HashSet<String>();

    setData.add("Apple");
    setData.add("Banana");
    setData.add("Apple");

    //java 1.5
    for (String s : setData) {
      System.out.println(s);
    }

    Iterator<String> it = setData.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
