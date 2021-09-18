package homework3.task1.aircrafts;

public class Plane extends AirCraft {
    protected TypeOfPlane type;

    public Plane(int capacity, int cargoCapacity, int flightRange, TypeOfPlane type) {
        super(capacity, cargoCapacity, flightRange);
        this.type = type;
    }

    public TypeOfPlane getType() {
        return type;
    }
}
