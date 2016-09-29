package behavioral.command.commands;

import behavioral.command.reciver.CarDron;

public class Stop implements ICarCommand {
    private CarDron car;

    public Stop(CarDron car) {
        super();
        this.car = car;
    }

    @Override
    public void execute() {
        car.stop();
    }

}
