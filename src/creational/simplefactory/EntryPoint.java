package creational.simplefactory;

import java.util.ArrayList;
import java.util.List;

import creational.simplefactory.car.ICarType;
import creational.simplefactory.car.ICarType.CarTypeId;
import creational.simplefactory.factory.ISimpleCarFactory;
import creational.simplefactory.factory.SimpleCarFactory;

public class EntryPoint {

    public static void main(String[] args) {
        ISimpleCarFactory simpleFactory = new SimpleCarFactory();
        List<ICarType> listCars = new ArrayList<ICarType>();
        listCars.add(simpleFactory.create(CarTypeId.SEDAN));
        listCars.add(simpleFactory.create(CarTypeId.MINIVAN));
        listCars.add(simpleFactory.create(CarTypeId.ROADSTER));
        for (ICarType carType : listCars) {
            System.out.println("car type: " + carType.getType());
        }

    }

}
