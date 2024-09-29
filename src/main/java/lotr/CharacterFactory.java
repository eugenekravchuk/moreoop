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
    int randomIndex = new Random().nextInt(characters.length);
    try {

      return characters[randomIndex].getDeclaredConstructor().newInstance();
    } catch (Exception e) {
      throw new RuntimeException("Character creation failed", e);
    }
  } 
}
