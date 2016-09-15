package behavioral.strategy.game;

import java.util.ArrayList;
import java.util.List;

import behavioral.strategy.game.person.Bird;
import behavioral.strategy.game.person.GamePerson;
import behavioral.strategy.game.person.Man;
import behavioral.strategy.game.person.Sharck;
import behavioral.strategy.game.person.strategy.fly.CanFlyStrategy;
import behavioral.strategy.game.person.strategy.fly.NoFlyStrategy;
import behavioral.strategy.game.person.strategy.move.CanMoveStrategy;
import behavioral.strategy.game.person.strategy.move.NoMoveStrategy;
import behavioral.strategy.game.person.strategy.swim.CanSwimStrategy;
import behavioral.strategy.game.person.strategy.swim.NoSwimStrategy;

public class EntryPoint {
    public static void main (String args[]) {
        List<GamePerson> persons;
        persons = new ArrayList<GamePerson>();
        persons.add(new Man("simple man", new CanMoveStrategy(), new CanSwimStrategy(), new NoFlyStrategy()));
        persons.add(new Man("super man", new CanMoveStrategy(), new CanSwimStrategy(), new CanFlyStrategy()));
        persons.add(new Bird("bird", new CanMoveStrategy(), new NoSwimStrategy(), new CanFlyStrategy()));
        persons.add(new Sharck("sharck", new NoMoveStrategy(), new CanSwimStrategy(), new NoFlyStrategy()));

        for (GamePerson person: persons) {
            person.presentSkils();
        }
    }
}
