package creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

import creational.factorymethod.factory.ICarCreator;
import creational.factorymethod.factory.PorscheCreator;
import creational.factorymethod.factory.SkodaCreator;
import creational.factorymethod.factory.VolkswagenCreator;

public class EntryPoint {

    public static void main(String[] args) {
        List<ICarCreator> creators = new ArrayList<ICarCreator>();
        creators.add(new VolkswagenCreator());
        creators.add(new SkodaCreator());
        creators.add(new PorscheCreator());
        for (ICarCreator creator : creators) {
            System.out.println(creator.createAuto());
        }
    }

}
