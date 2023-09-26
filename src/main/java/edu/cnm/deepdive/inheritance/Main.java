package edu.cnm.deepdive.inheritance;

import edu.cnm.deepdive.inheritance.model.Canis;
import edu.cnm.deepdive.inheritance.model.Dog;
import edu.cnm.deepdive.inheritance.model.Wolf;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Canis> roster = new LinkedList<>();
    roster.add(new Wolf());
    roster.add(new Wolf());
    roster.add(new Dog());
    roster.add(new Dog());
    Collections.shuffle(roster);
    for (Canis c : roster) {
      c.hunt();
      c.hunt("snapping turtle");
      if (c instanceof Dog d) {
        d.perform();
        Dog.describe();
      } else if (c instanceof Wolf) {
        Wolf.describe();
      } else {
        Canis.describe();
      }
    }
  }
}
