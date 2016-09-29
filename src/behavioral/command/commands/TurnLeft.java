package behavioral.command.commands;

import behavioral.command.reciver.CarDron;

public class TurnLeft implements ICarCommand {
    private CarDron car;

    public TurnLeft(CarDron car) {
        super();
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnLeft();
    }

}
