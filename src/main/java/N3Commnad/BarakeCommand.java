package N3Commnad;

public class BarakeCommand implements Command{
    private Vehicle vehicle;

    public BarakeCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.brake();
    }
}
