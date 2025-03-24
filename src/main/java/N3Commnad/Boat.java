package N3Commnad;

public class Boat extends Vehicle{
private String name;

public Boat(String name){
    this.name = name;
}

    @Override
    void start() {
        System.out.println("Starting boat: " + name);
    }

    @Override
    void acelerate() {
        System.out.println("Accelerating the boat: " + name);

    }

    @Override
    void brake() {
        System.out.println("Braking the boat: " +  name);

    }
}
