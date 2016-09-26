package utils;

import airCompany.CargoPlane;
import airCompany.Plane;

import java.util.ArrayList;

/**
 * Created by Oleh on 25.09.2016.
 */
public class Searcher {

    ArrayList distanceList = new ArrayList();
    public static ArrayList <CargoPlane> findByName(String searchValue, ArrayList<CargoPlane> cargoPlanes) {
        ArrayList<CargoPlane> foundPlanes = new ArrayList();
        for (CargoPlane plane : cargoPlanes) {
            if (searchValue.equals(plane.getPlaneName())) {
                foundPlanes.add(plane);
            }
           }
        return foundPlanes;



    }
    public static CargoPlane findByDistance(String searchValue, ArrayList<CargoPlane> cargoPlanes) throws RuntimeException {
        for (CargoPlane plane : cargoPlanes) {
            if (searchValue.equals(plane.getDistance())) {
                return plane;
            }
        }
        throw new RuntimeException("Plane with such  distance was not found");

    }
}

