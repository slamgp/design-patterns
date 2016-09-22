package creational.abstractfactory.factory;

import creational.abstractfactory.car.skoda.EuropianSkoda;
import creational.abstractfactory.car.skoda.ISkoda;
import creational.abstractfactory.car.volkswagen.EuropianVolkswagen;
import creational.abstractfactory.car.volkswagen.IVolkswagen;

public class EuropianFactory implements ICarFactory {

    @Override
    public ISkoda createSkoda() {
        return new EuropianSkoda();
    }

    @Override
    public IVolkswagen createVolksvagen() {
        return new EuropianVolkswagen();
    }

}
