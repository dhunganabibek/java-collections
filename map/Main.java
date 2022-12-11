package map;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Map<String, Integer> mymap = new HashMap<String, Integer>();

    mymap.put("Bibek", 25);
    mymap.put("Aneel", 31);
    mymap.put("Amrit", 25);
    mymap.put("Dhan", 32);

    //fetch all data
    for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
      System.out.println(entry.getKey() + "---------" + entry.getValue());
    }
  }
}
