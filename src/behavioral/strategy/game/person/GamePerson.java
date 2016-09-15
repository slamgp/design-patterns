package behavioral.strategy.game.person;

import behavioral.strategy.game.person.strategy.fly.IFly;
import behavioral.strategy.game.person.strategy.move.IMove;
import behavioral.strategy.game.person.strategy.swim.ISwim;

public abstract class GamePerson {

    protected IMove moveStrategy;
    protected ISwim swimStrategy;
    protected IFly flyStrategy;
    protected String description;

    public GamePerson() {
    }

    public GamePerson(String description, IMove moveStrategy, ISwim swimStrategy, IFly flyStrategy) {
        this.moveStrategy = moveStrategy;
        this.swimStrategy = swimStrategy;
        this.flyStrategy = flyStrategy;
        this.description = description;
    }

    public void move() {
        moveStrategy.move();
    }

    public void swim() {
        swimStrategy.swim();
    }

    public void fly() {
        flyStrategy.fly();
    }

    public void show() {
        System.out.println("show on scene");
    }

    public void hide() {
        System.out.println("hide from scene");
    }

    public IMove getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(IMove moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public ISwim getSwimStrategy() {
        return swimStrategy;
    }

    public void setSwimStrategy(ISwim swimStrategy) {
        this.swimStrategy = swimStrategy;
    }

    public IFly getFlyStrategy() {
        return flyStrategy;
    }

    public void setFlyStrategy(IFly flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void presentSkils() {
        System.out.println(getDescription());
        move();
        fly();
        swim();
        System.out.println("----------------");
    }

}
