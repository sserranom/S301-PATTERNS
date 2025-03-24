package N3Commnad;

public class Airplane extends Vehicle{

    private String name;

    public Airplane(String name){
        this.name = name;
    }
    @Override
    void start() {
        System.out.println("Starting Airplane: " + name);
    }

    @Override
    void acelerate() {
        System.out.println("Accelerating the airplane: " + name);

    }

    @Override
    void brake() {
        System.out.println("Braking the airplane: " + name);

    }
}
