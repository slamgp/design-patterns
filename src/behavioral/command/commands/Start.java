package behavioral.command.commands;

import behavioral.command.reciver.CarDron;

public class Start implements ICarCommand {
    private CarDron car;

    public Start(CarDron car) {
        super();
        this.car = car;
    }

    @Override
    public void execute() {
        car.start();
    }

}
