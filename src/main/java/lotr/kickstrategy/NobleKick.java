package lotr.kickstrategy;

public class NobleKick implements KickStrategy {
  @Override
  public void kick(lotr.Character whoKick, lotr.Character whoIsKicked) {
    System.out.println("Cry!");
  }
}