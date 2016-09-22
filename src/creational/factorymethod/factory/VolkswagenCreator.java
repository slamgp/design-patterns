package creational.factorymethod.factory;

import creational.factorymethod.car.ICar;
import creational.factorymethod.car.Volkswagen;

public class VolkswagenCreator implements ICarCreator {

    @Override
    public ICar createAuto() {
        return new Volkswagen();
    }

}
