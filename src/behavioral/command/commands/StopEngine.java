package behavioral.command.commands;

import behavioral.command.reciver.CarDron;

public class StopEngine implements ICarCommand {
    private CarDron car;

    public StopEngine(CarDron car) {
        super();
        this.car = car;
    }

    @Override
    public void execute() {
        car.stopEngine();
    }

}
