package edu.cnm.deepdive.inheritance.model;

public class Dog extends Wolf {

  @Override
  public void hunt() {
    super.hunt();
    System.out.println("Hunt according to how i was trained in obedience school.");
  }

  @Override
  public void hunt(String prey) {
    super.hunt(prey);
    System.out.println("chase, catch and play with" + prey);
  }

  public static void describe() {
    System.out.println("I am an instance of the dog class.");
  }

  public void perform(){
    System.out.println("This is my trick! I'm the best dog.");
  }
}
