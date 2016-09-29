package behavioral.command.reciver;

public class CarDron {

    private final String name;

    public CarDron(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Soper CAR name: " + name;
    }

    public void startEngine() {
        System.out.println("switch on the ignition");
        if (checkBaseSystems()) {
            System.out.println(this);
            System.out.println("start engine");
        }
    }

    public void stopEngine() {
        System.out.println(this);
        stop();
        System.out.println("stop engine");
    }

    public void stop() {
        System.out.println(this);
        System.out.println("stop motion");
    }

    public void start() {
        System.out.println(this);
        startEngine();
        System.out.println("start motion");
    }

    public void turnRight() {
        System.out.println(this);
        showBlinker(1);
        System.out.println("turn right");
        showBlinker(0);
    }

    public void turnLeft() {
        System.out.println(this);
        showBlinker(-1);
        System.out.println("turn left");
        showBlinker(0);
    }

    private boolean checkBaseSystems() {
        System.out.println(this);
        return true;
    }

    private void showBlinker(int blink) {
        System.out.println(this);
        if (blink > 0) {
            System.out.println("show right blinker");
        } else if (blink < 0){
            System.out.println("show left blinker");
        } else {
            System.out.println("switch off blink");
        }
    }

}
