package homework3.task1.aircrafts;

public abstract class AirCraft implements Comparable<AirCraft> {
    protected int cargoCapacity;
    protected int capacity;
    protected int flightRange;

    AirCraft(int capacity, int cargoCapacity, int flightRange) {
        this.capacity = capacity; //passenger seat
        this.cargoCapacity = cargoCapacity; //kg
        this.flightRange = flightRange; //km
    }

    public int getFlightRange() {
        return flightRange;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int compareTo(AirCraft o) {
        return flightRange - o.flightRange;
    }
}
