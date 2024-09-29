package lotr;

import java.util.Random;

public class CharacterFactory {
  public static lotr.Character createCharacter() {
    Class<? extends lotr.Character>[] characters = new Class[] {
      Elf.class,
      Hobbit.class,
      King.class,
      Knight.class
    };

    Random random = new Random();
    int randomIndex = random.nextInt(characters.length);

    try {
      return characters[randomIndex].getDeclaredConstructor().newInstance();
    } catch (Exception e) {
      throw new RuntimeException("Character creation failed", e);
    }
  }
}