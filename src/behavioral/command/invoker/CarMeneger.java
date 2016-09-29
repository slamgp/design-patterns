package behavioral.command.invoker;

import java.util.HashMap;

import behavioral.command.commands.ICarCommand;

public class CarMeneger {
    private HashMap <String, ICarCommand> carCommand;

    public CarMeneger() {
        carCommand = new HashMap<String, ICarCommand>();
    }

    public void addCommand(String key, ICarCommand command) {
        carCommand.put(key, command);
    }

    public ICarCommand getCommand(String key) {
        return carCommand.get(key);
    }
}
