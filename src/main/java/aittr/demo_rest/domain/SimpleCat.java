package aittr.demo_rest.domain;

import java.util.Objects;

public class SimpleCat implements Cat{
  private int id;
  private int age;
  private String color;
  private double weight;

  public SimpleCat(int age, String color, double weight) {
    this.age = age;
    this.color = color;
    this.weight = weight;
  }

  public SimpleCat(int id, int age, String color, double weight) {
    this.id = id;
    this.age = age;
    this.color = color;
    this.weight = weight;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public void setId(int id) {
    this.id = id;
  }

  @Override
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleCat simpleCat = (SimpleCat) o;
    return id == simpleCat.id && age == simpleCat.age
        && Double.compare(simpleCat.weight, weight) == 0 && Objects.equals(color,
        simpleCat.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, age, color, weight);
  }

  @Override
  public String toString() {
    return "SimpleCat{" +
        "id=" + id +
        ", age=" + age +
        ", color='" + color + '\'' +
        ", weight=" + weight +
        '}';
  }
}
