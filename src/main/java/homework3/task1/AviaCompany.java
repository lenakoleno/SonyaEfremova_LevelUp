package homework3.task1;

import homework3.task1.aircrafts.AirCraft;
import homework3.task1.aircrafts.Helicopter;
import homework3.task1.aircrafts.Plane;
import homework3.task1.aircrafts.Quadcopter;
import homework3.task1.aircrafts.TypeOfHelicopter;
import homework3.task1.aircrafts.TypeOfPlane;
import homework3.task1.aircrafts.TypeOfQuadcopter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AviaCompany {
    public static void main(String[] args) {
        Plane passenger = new Plane(50, 20, 30, TypeOfPlane.PASSENGER);
        Plane military = new Plane(30, 50, 60, TypeOfPlane.MILITARY);
        Helicopter singlerotor = new Helicopter(4, 35, 45, TypeOfHelicopter.SINGLEROTOR);
        Helicopter twinrotor = new Helicopter(4, 75, 85, TypeOfHelicopter.TWINROTOR);
        Quadcopter toy = new Quadcopter(1, 1, 10, TypeOfQuadcopter.TOY);
        Quadcopter shooting = new Quadcopter(1, 1, 50, TypeOfQuadcopter.SHOOTING);
        AviaCompany app = new AviaCompany();
        List<AirCraft> name = new ArrayList<>();
        name.add(passenger);
        name.add(military);
        name.add(singlerotor);
        name.add(twinrotor);
        name.add(toy);
        name.add(shooting);
        app.totalCapacity(name);
        app.totalCargoCapacity(name);
        System.out.println("Unsorted list of all aircrafts: ");
        for (AirCraft craft : name) {
            System.out.println(craft.getFlightRange());
        }
        Collections.sort(name);
        System.out.println("Sorted list of all aircrafts: ");
        for (AirCraft airCraft : name) {
            System.out.println(airCraft.getFlightRange());
        }
        app.neededPlane(name);
    }

    public void totalCapacity(List<AirCraft> airCrafts) {
        int sum = 0;
        for (AirCraft airCraft : airCrafts) {
            sum += airCraft.getCapacity();
        }
        System.out.println("Total capacity: " + sum);
    }

    public void totalCargoCapacity(List<AirCraft> airCrafts) {
        int sum2 = 0;
        for (AirCraft airCraft : airCrafts) {
            sum2 += airCraft.getCargoCapacity();
        }
        System.out.println("Total cargo capacity: " + sum2);
    }

    public void neededPlane(List<AirCraft> airCrafts) {
        for (int i = 0; i < airCrafts.size(); i++) {
            AirCraft airCraft = airCrafts.get(i);

            if (airCraft instanceof Plane && airCraft.getFlightRange() > 40 && airCraft.getCargoCapacity() > 45
                && airCraft.getCapacity() < 40) {
                System.out.println("Needed plane: " + ((Plane) airCraft).getType());
            }
        }
    }
}
