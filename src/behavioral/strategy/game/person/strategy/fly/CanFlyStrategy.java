package behavioral.strategy.game.person.strategy.fly;

public class CanFlyStrategy implements IFly {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

}
