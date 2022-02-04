package homework4.task1;

import homework3.task1.aircrafts.Helicopter;
import homework3.task1.aircrafts.Plane;
import homework3.task1.aircrafts.Quadcopter;
import homework3.task1.aircrafts.TypeOfHelicopter;
import homework3.task1.aircrafts.TypeOfPlane;
import homework3.task1.aircrafts.TypeOfQuadcopter;
import java.net.UnknownHostException;

public class ExceptionInitialDemo {

    public static void main(String[] args) {
        Plane business = new Plane(0, -100, 200, TypeOfPlane.BUSINESS);
        Helicopter transport = new Helicopter(100, 0, 200, TypeOfHelicopter.TRANSPORT);
        Quadcopter little = new Quadcopter(0, 5, 1100, TypeOfQuadcopter.LITTLE);
        //        try {
        //            if (business.getCargoCapacity() < 0) {
        //                throw new NegativeNumberException("меньше нуля");
        //            }
        //        } catch (NegativeNumberException error) {
        //            System.err.println(
        //                business.getType() + " - данный тип самолета не может обладать грузоподъемностью " + " "
        //                    + error.getMessage());
        //        }
        //
        //        try {
        //            if (transport.getCargoCapacity() == 0) {
        //                throw new NullNumberException("равной нулю");
        //            }
        //        } catch (NullNumberException error) {
        //            System.err.println(
        //                transport.getType() + " - данный тип вертолета не может обладать грузоподъемностью " + " "
        //                    + error.getMessage());
        //        }
        //        try {
        //            if (little.getFlightRange() > 1000) {
        //                throw new BigNumberException("больше 1000км");
        //            }
        //        } catch (BigNumberException error) {
        //            System.err.println(
        //                little.getType() + " - данный тип квадрокоптера не может обладать дальностью полета "
        //                    + " "
        //                    + error.getMessage());
        //        }

        try {
            int result = kek("param");
            System.out.println(result);
            int res2 = lol("12");
        } catch (IllegalArgumentException e) {
            System.out.println("Error occured!!!!");
        } catch (UnsupportedOperationException e) {
            System.out.println("Another except");
        }

        System.out.println("eeeeeeee");
    }

    public static int kek(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name must longer than 3");
        }

        return name.length() * 10;
    }

    public static int lol(String name) {
        if (name.length() < 5) {
            throw new UnsupportedOperationException("Name must longer than 5");
        }

        return name.length() * 10;
    }
}
