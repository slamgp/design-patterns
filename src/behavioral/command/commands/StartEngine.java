package behavioral.command.commands;

import behavioral.command.reciver.CarDron;

public class StartEngine implements ICarCommand {
    private CarDron car;

    public StartEngine(CarDron car) {
        super();
        this.car = car;
    }

    @Override
    public void execute() {
        car.startEngine();
    }

}
