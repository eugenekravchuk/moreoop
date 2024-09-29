package lotr;

import java.util.Random;

import lotr.Character;
import lotr.kickstrategy.NobleKick;

public abstract class Noble extends Character {
  public Noble(int min, int max) {
      super(new Random().nextInt(min, max), new Random().nextInt(min, max), new NobleKick());
  }
  
  @Override
  public void kick(Character c) { 
    c.setHp(c.getHp() - new Random().nextInt(0, c.getPower()));
  }
}
