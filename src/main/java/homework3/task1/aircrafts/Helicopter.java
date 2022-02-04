package homework3.task1.aircrafts;

public class Helicopter extends AirCraft {
    protected TypeOfHelicopter type;

    public Helicopter(int capacity, int cargoCapacity, int flightRange, TypeOfHelicopter type) {
        super(capacity, cargoCapacity, flightRange);
        this.type = type;
        int[] array = new int[10];
        array[0] = 1;
        int[] tempArray = new int[11];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
        array[10] = 22;

    }

    public TypeOfHelicopter getType() {
        return type;
    }
}
