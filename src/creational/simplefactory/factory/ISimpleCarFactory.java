package creational.simplefactory.factory;

import creational.simplefactory.car.ICarType;


public interface ISimpleCarFactory {
    ICarType create(int typeId);
}
