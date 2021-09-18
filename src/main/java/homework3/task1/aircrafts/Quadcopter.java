package homework3.task1.aircrafts;

public class Quadcopter extends AirCraft {
    protected TypeOfQuadcopter type;

    public Quadcopter(int capacity, int cargoCapacity, int flightRange, TypeOfQuadcopter type) {
        super(capacity, cargoCapacity, flightRange);
        this.type = type;
    }
}
