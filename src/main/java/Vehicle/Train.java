package Vehicle;

public class Train extends TransportVehicle{
    public Train(String name, int speed) {
        super(name, speed);
    }

    @Override
    public String moved() {
        return "";
    }

    @Override
    public void start() {
        super.start();
    }
}
