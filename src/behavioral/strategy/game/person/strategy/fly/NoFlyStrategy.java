package behavioral.strategy.game.person.strategy.fly;

public class NoFlyStrategy implements IFly {
    @Override
    public void fly() {
        System.out.println("I am NOT flying");
    }

}
