package creational.abstractfactory.factory;

import creational.abstractfactory.car.skoda.ISkoda;
import creational.abstractfactory.car.skoda.USASkoda;
import creational.abstractfactory.car.volkswagen.IVolkswagen;
import creational.abstractfactory.car.volkswagen.USAVolkswagen;

public class USAFactory implements ICarFactory {

    @Override
    public ISkoda createSkoda() {
        return new USASkoda();
    }

    @Override
    public IVolkswagen createVolksvagen() {
        return new USAVolkswagen();
    }

}
