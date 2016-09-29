package behavioral.command.commands;

import behavioral.command.reciver.CarDron;

public class TurnRight implements ICarCommand {
    private CarDron car;

    public TurnRight(CarDron car) {
        super();
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnRight();
    }

}
