import lotr.CharacterFactory;
import lotr.GameManager;

public class Demo {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        lotr.Character character1 = CharacterFactory.createCharacter();
        lotr.Character  character2 = CharacterFactory.createCharacter();
        gameManager.fight(character1, character2);
    }
}
