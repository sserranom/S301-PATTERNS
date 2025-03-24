package N3Commnad;

public class AcelerateCommand implements Command {
    private Vehicle vehicle;

    public AcelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.acelerate();
    }
}
