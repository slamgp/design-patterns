package creational.abstractfactory.factory;

import creational.abstractfactory.car.skoda.ISkoda;
import creational.abstractfactory.car.volkswagen.IVolkswagen;

public interface ICarFactory {
    ISkoda createSkoda();
    IVolkswagen createVolksvagen();
}
