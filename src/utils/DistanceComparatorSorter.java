package utils;

import airCompany.CargoPlane;
import airCompany.Plane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Oleh on 25.09.2016.
 */
public class DistanceComparatorSorter  {

private ArrayList <CargoPlane> planes = new ArrayList<>();

    public DistanceComparatorSorter(ArrayList<CargoPlane> planes) {
        this.planes = planes;
    }

    public void sort(){
        Collections.sort(planes,new DistanceComparator2());
    }

}

