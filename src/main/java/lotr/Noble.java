package lotr;

import java.util.Random;

import lotr.Character;
import lotr.kickstrategy.NobleKick;

public abstract class Noble extends Character {
  private static final Random RANDOM = new Random();

  public Noble(int min, int max) {
    // Adjusted to use nextInt with a calculated range
    super(min + RANDOM.nextInt(max - min), min + RANDOM.nextInt(max - min), new NobleKick());
  }
  
  @Override
  public void kick(Character c) { 
    // Adjusted to use nextInt with a calculated range
    c.setHp(c.getHp() - RANDOM.nextInt(c.getPower() + 1)); // +1 to include the upper bound
  }
}
