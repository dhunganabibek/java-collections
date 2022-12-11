package set;

import java.util.Objects;

public class Fruit implements Comparable<Fruit> {

  private float price;
  private String color;
  private String description;

  public Fruit() {}

  public Fruit(float price, String color, String description) {
    this.price = price;
    this.color = color;
    this.description = description;
  }

  public float getPrice() {
    return this.price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Fruit price(float price) {
    setPrice(price);
    return this;
  }

  public Fruit color(String color) {
    setColor(color);
    return this;
  }

  public Fruit description(String description) {
    setDescription(description);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Fruit)) {
      return false;
    }
    Fruit fruit = (Fruit) o;
    return (
      price == fruit.price &&
      Objects.equals(color, fruit.color) &&
      Objects.equals(description, fruit.description)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, color, description);
  }

  @Override
  public String toString() {
    return (
      "{" +
      " price='" +
      getPrice() +
      "'" +
      ", color='" +
      getColor() +
      "'" +
      ", description='" +
      getDescription() +
      "'" +
      "}"
    );
  }

  public void eat() {
    System.out.println("Do not eat me");
  }

  @Override
  public int compareTo(Fruit f) {
    return (int) (this.getPrice() - f.getPrice());
  }
}
