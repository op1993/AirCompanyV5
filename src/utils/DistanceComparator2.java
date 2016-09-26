package utils;

import airCompany.CargoPlane;
import airCompany.Plane;

import java.util.Comparator;

/**
 * Created by Oleh on 26.09.2016.
 */
public class DistanceComparator2 implements Comparator <Plane>{

    @Override public int compare( Plane o1,  Plane o2) {
        if (o1.getDistance() > o2.getDistance()) {
            return 1;
        } else if (o1.getDistance() < o2.getDistance()) {
            return -1;
        }
        return 0;
    }
}
