package creational.simplefactory.car;


public class Minivan implements ICarType {
    final int TYPE_ID = CarTypeId.MINIVAN;

    @Override
    public int getType() {
        return TYPE_ID;
    }
    
}
