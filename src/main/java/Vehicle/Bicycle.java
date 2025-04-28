package Vehicle;

import java.sql.SQLOutput;

public class Bicycle extends TransportVehicle{

    public Bicycle(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public String moved() {

        System.out.println("pedaling");
        return "";
    }
}
