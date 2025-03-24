package N3Commnad;

public class Car extends Vehicle{
    private String name;

    public Car(String name){
        this.name = name;
    }
    @Override
    void start() {
        System.out.println("Starting Car: " + name);
    }

    @Override
    void acelerate() {
        System.out.println("Accelerating the Car: " + name);

    }

    @Override
    void brake() {
        System.out.println("Braking the Car: " + name);

    }
}
