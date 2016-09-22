package creational.factorymethod.factory;

import creational.factorymethod.car.ICar;
import creational.factorymethod.car.Skoda;

public class PorscheCreator implements ICarCreator {

    @Override
    public ICar createAuto() {
        return new Skoda();
    }

}
