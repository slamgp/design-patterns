package creational.simplefactory.factory;

import creational.simplefactory.car.ICarType;
import creational.simplefactory.car.ICarType.CarTypeId;
import creational.simplefactory.car.Minivan;
import creational.simplefactory.car.Roadster;
import creational.simplefactory.car.Sedan;


public class SimpleCarFactory implements ISimpleCarFactory{

    @Override
    public ICarType create(int typeId) {
        if (typeId == CarTypeId.MINIVAN) {
            return new Minivan();
        } else if(typeId == CarTypeId.SEDAN) {
            return new Sedan();
        } else if(typeId == CarTypeId.ROADSTER) {
            return new Roadster();
        } else {
            return null;
        }
    }

}
