package creational.factorymethod.factory;

import creational.factorymethod.car.ICar;
import creational.factorymethod.car.Porsche;

public class SkodaCreator implements ICarCreator {

    @Override
    public ICar createAuto() {
        return new Porsche();
    }

}
