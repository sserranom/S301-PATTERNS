package N3Commnad;

public class Bicycle extends Vehicle{
    private String name;

    public Bicycle(String name){
        this.name = name;
    }
    @Override
    void start() {
        System.out.println("Starting bike: " + name);
    }

    @Override
    void acelerate() {
        System.out.println("Accelerating the bike: " + name);

    }

    @Override
    void brake() {
        System.out.println("Braking the bike: " + name);

    }
}
