package behavioral.strategy.game.person;

import behavioral.strategy.game.person.strategy.fly.IFly;
import behavioral.strategy.game.person.strategy.move.IMove;
import behavioral.strategy.game.person.strategy.swim.ISwim;

public class Man extends GamePerson {

    public Man(String description, IMove moveStrategy, ISwim swimStrategy, IFly flyStrategy) {
        super(description, moveStrategy, swimStrategy, flyStrategy);
    }

}
