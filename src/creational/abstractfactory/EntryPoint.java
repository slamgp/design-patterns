package creational.abstractfactory;

import creational.abstractfactory.factory.EuropianFactory;
import creational.abstractfactory.factory.ICarFactory;
import creational.abstractfactory.factory.USAFactory;

public class EntryPoint {

    public static void main(String[] args) {
        ICarFactory carFactory;
        carFactory = new EuropianFactory();
        createCars(carFactory);
        carFactory = new USAFactory();
        createCars(carFactory);
    }

    private static void createCars(ICarFactory carFactory) {
        System.out.println(carFactory.createSkoda());
        System.out.println(carFactory.createVolksvagen());
    }
}
