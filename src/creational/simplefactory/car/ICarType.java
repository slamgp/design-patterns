package creational.simplefactory.car;

public interface ICarType {
    public static interface CarTypeId {
        public static final int SEDAN = 0;
        public static final int MINIVAN = 1;
        public static final int ROADSTER = 2;
    }
    int getType();
}
