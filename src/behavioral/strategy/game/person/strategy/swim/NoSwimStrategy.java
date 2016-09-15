package behavioral.strategy.game.person.strategy.swim;

public class NoSwimStrategy implements ISwim {
    @Override
    public void swim() {
        System.out.println("I am NOT swiming");
    }

}
