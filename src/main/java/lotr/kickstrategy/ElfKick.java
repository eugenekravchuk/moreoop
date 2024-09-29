package lotr.kickstrategy;

public class ElfKick implements KickStrategy {
  @Override
  public void kick(lotr.Character whoKick, lotr.Character whoIsKicked) {
    System.out.println("Cry!");
  }
}
