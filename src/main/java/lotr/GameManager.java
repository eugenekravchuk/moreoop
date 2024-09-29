package lotr;

public class GameManager {
  public void fight(Character c1, Character c2) { 
    System.out.println("Fight between:");
    System.out.println(c1);
    System.out.println("VS");
    System.out.println(c2);
    System.out.println();

    while (c1.getHp() > 0 && c2.getHp() > 0) {
      int c2InitialHp = c2.getHp();
      c1.kick(c2);
      int c2DamageTaken = c2InitialHp - c2.getHp();

      System.out.println(c1 + " attacks " + c2 + " and deals " + c2DamageTaken + " damage.");
      System.out.println(c1 + " has " + c1.getHp() + " HP left.");
      System.out.println(c2 + " has " + c2.getHp() + " HP left.");

      if (c2.getHp() <= 0) {
          break;
      }

      int c1InitialHp = c1.getHp();
      c2.kick(c1);
      int c1DamageTaken = c1InitialHp - c1.getHp();

      System.out.println(c2 + " attacks " + c1 + " and deals " + c1DamageTaken + " damage.");
      System.out.println(c1 + " has " + c1.getHp() + " HP left.");
      System.out.println(c2 + " has " + c2.getHp() + " HP left.");
      System.out.println();

      System.out.println("Fight finished.");
      if (c1.getHp() > 0) {
          System.out.println(c1 + " won!");
      } else if (c2.getHp() > 0) {
          System.out.println(c2 + " won!");
      } else {
          System.out.println("Both characters are dead.");
      }
  }
  }
}
