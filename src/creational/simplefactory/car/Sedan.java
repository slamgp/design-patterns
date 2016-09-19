package creational.simplefactory.car;



public class Sedan implements ICarType {
    final int TYPE_ID = CarTypeId.SEDAN;

    @Override
    public int getType() {
        return TYPE_ID;
    }
}
