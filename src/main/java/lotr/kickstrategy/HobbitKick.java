package lotr.kickstrategy;

public class HobbitKick implements KickStrategy {
  @Override
  public void kick(lotr.Character whoKick, lotr.Character whoIsKicked) {
    System.out.println("Cry!");
  }
}
