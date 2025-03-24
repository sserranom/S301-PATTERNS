package N3Commnad;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();

        Vehicle car = new Car("Toyota Celica");
        Vehicle bicycle = new Bicycle("Urban Bike 2");
        Vehicle boat = new Boat("Boat1");
        Vehicle plane = new Airplane("Airbus 319");

        parking.runCommand(new StartCommand(car));
        parking.runCommand(new AcelerateCommand(car));
        parking.runCommand(new BarakeCommand(car));

        parking.runCommand(new StartCommand(bicycle));
        parking.runCommand(new AcelerateCommand(bicycle));
        parking.runCommand(new BarakeCommand(bicycle));

        parking.runCommand(new StartCommand(boat));
        parking.runCommand(new AcelerateCommand(boat));
        parking.runCommand(new BarakeCommand(boat));

        parking.runCommand(new StartCommand(plane));
        parking.runCommand(new AcelerateCommand(plane));
        parking.runCommand(new BarakeCommand(plane));

    }
}
