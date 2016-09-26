package utils;

import airCompany.CargoPlane;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Oleh on 25.09.2016.
 */
public class Calculator {

    ArrayList<CargoPlane> cargoPlanes = new ArrayList<>();

    public Calculator(ArrayList<CargoPlane> planes) {
        this.cargoPlanes = planes;
    }

    public float capacitySum() {
        float totalCapacitySum = 0;
        Iterator<CargoPlane> planeIterator = cargoPlanes.iterator();
        while (planeIterator.hasNext()) {
            totalCapacitySum += planeIterator.next().getCapacity();
        }
        return totalCapacitySum;
    }

    public float carryCapacitySum() {
        float totalCarryCapacitySum = 0;
        Iterator<CargoPlane> planeIterator = cargoPlanes.iterator();
        while (planeIterator.hasNext()) {
            totalCarryCapacitySum += planeIterator.next().getCarryCapacity();
        }
        return totalCarryCapacitySum;
    }
}
