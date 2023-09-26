package edu.cnm.deepdive.inheritance.model;

public abstract class Canis {

  private int weight;

  public abstract void hunt ();

  public abstract void hunt (String prey);

  public static void describe() {
    System.out.println("i am an instance of the Canis class.");
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
