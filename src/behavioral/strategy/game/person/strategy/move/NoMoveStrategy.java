package behavioral.strategy.game.person.strategy.move;

public class NoMoveStrategy implements IMove {
    @Override
    public void move() {
        System.out.println("I am NOT moving");
    }

}
