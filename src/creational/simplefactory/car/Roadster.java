package creational.simplefactory.car;



public class Roadster implements ICarType {
    final int TYPE_ID = CarTypeId.ROADSTER;

    @Override
    public int getType() {
        return TYPE_ID;
    }
}
