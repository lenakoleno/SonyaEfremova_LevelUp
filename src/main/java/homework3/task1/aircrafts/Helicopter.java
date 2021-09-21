package homework3.task1.aircrafts;

public class Helicopter extends AirCraft {
    protected TypeOfHelicopter type;

    public Helicopter(int capacity, int cargoCapacity, int flightRange, TypeOfHelicopter type) {
        super(capacity, cargoCapacity, flightRange);
        this.type = type;
    }

    public TypeOfHelicopter getType() {
        return type;
    }
}
