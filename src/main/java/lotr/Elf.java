package lotr;

import lotr.Character;
import lotr.kickstrategy.ElfKick;

public class Elf extends Character {
  public Elf() {
    super(10,10, new ElfKick());
  }

  @Override
  public void kick(lotr.Character c) { 
    if (c.getPower() < this.getPower()) {
      c.setHp(0);
    } else {
      this.setHp(this.getHp() - 1);
    }
  }
}
