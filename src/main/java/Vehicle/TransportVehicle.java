package Vehicle;

public abstract class TransportVehicle {
    private  String name;
    private int speed;

    public TransportVehicle(String name, int speed) {
    }

    public void start(){
        if(speed > 0){
            System.out.println(name + " vehicle has started");
        }

    }
    public abstract String moved();

}
