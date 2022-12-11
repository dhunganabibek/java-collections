package set;

public class Test {

  public static void main(String[] args) {
    int runtime = 64177857;
    Integer i = new Integer(runtime);
    String str = "Bibek";

    System.out.println(i.hashCode());
    System.out.println(str.hashCode());

    //If two object has same hash code, we also need to overwrite the hash code
    System.out.println();
  }
}
