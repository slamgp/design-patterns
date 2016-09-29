package behavioral.command;

import behavioral.command.commands.Start;
import behavioral.command.commands.StartEngine;
import behavioral.command.commands.Stop;
import behavioral.command.commands.StopEngine;
import behavioral.command.commands.TurnLeft;
import behavioral.command.commands.TurnRight;
import behavioral.command.invoker.CarMeneger;
import behavioral.command.reciver.CarDron;

public class EntryPoint {

    public static void main(String []args) {
        CarDron yellowCar = new CarDron("YELLOW CAR");
        CarDron BlueCar = new CarDron("BLUE CAR");

        CarMeneger carMeneger1 = new CarMeneger();
        carMeneger1.addCommand("startEngine", new StartEngine(yellowCar));
        carMeneger1.addCommand("stopEngine", new StopEngine(yellowCar));
        carMeneger1.addCommand("start", new Start(yellowCar));
        carMeneger1.addCommand("stop", new Stop(yellowCar));
        carMeneger1.addCommand("turnLeft", new TurnLeft(yellowCar));
        carMeneger1.addCommand("turnRight", new TurnRight(yellowCar));

        CarMeneger carMeneger2 = new CarMeneger();
        carMeneger2.addCommand("startEngine", new StartEngine(BlueCar));
        carMeneger2.addCommand("stopEngine", new StopEngine(BlueCar));
        carMeneger2.addCommand("start", new Start(BlueCar));
        carMeneger2.addCommand("stop", new Stop(BlueCar));
        carMeneger2.addCommand("turnLeft", new TurnLeft(BlueCar));
        carMeneger2.addCommand("turnRight", new TurnRight(BlueCar));
        
        carMeneger1.getCommand("startEngine").execute();
        carMeneger1.getCommand("start").execute();
        carMeneger1.getCommand("turnLeft").execute();
        carMeneger2.getCommand("startEngine").execute();
        carMeneger2.getCommand("start").execute();
        carMeneger2.getCommand("turnLeft").execute();
        carMeneger2.getCommand("stopEngine").execute();
        carMeneger1.getCommand("stop").execute();
    }
}